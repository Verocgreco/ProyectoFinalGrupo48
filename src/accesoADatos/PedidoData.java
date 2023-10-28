package accesoADatos;

import entidades.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoData {

    private Connection conn = null;
    private MesaData mData = new MesaData();

    public PedidoData() {
        conn = Conexion.getConexion();
    }

    public Pedido buscarPedido(int idPedido) {
        Pedido pedido = null;
        String sql = "SELECT * FROM pedido WHERE id_pedido= ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPedido(idPedido);
                pedido.setMesa(mData.buscarMesa(rs.getInt("id_mesa")));
                pedido.setMesero(rs.getString("nombre_mesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("cobrada"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla Pedido");
        }
        return pedido;

    }

    public void pedidoNuevo(Pedido pedido) {
        try {
            String sql = "INSERT INTO pedido (id_mesa, nombre_mesero, fecha, hora, importe, cobrada)VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setString(2, pedido.getMesero());
            ps.setDate(3, Date.valueOf(pedido.getFecha()));
            ps.setTime(4, Time.valueOf(pedido.getHora()));
            ps.setDouble(5, 0);
            ps.setBoolean(6, false);//false sería no cobrada aún
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "Pedido agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla Pedido");
        }
    }

    public void cobrarPedido(int id) {
        try {
            String sql = "UPDATE pedido SET cobrada=1 WHERE id_pedido=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                //JOptionPane.showMessageDialog(null, "Mesa cobrada");
            } else {
                JOptionPane.showMessageDialog(null, "La mesa no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla Pedido");
        }
    }

    public void modificarPedido(Pedido pedido) {
        try {
            String sql = "UPDATE pedido SET id_mesa=?, nombre_mesero=?, fecha=?, hora=?, importe=? WHERE id_pedido=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setString(2, pedido.getMesero());
            ps.setDate(3, Date.valueOf(pedido.getFecha()));
            ps.setTime(4, Time.valueOf(pedido.getHora()));
            ps.setDouble(5, pedido.getImporte());
            ps.setInt(6, pedido.getIdPedido());
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Pedido modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Pedido inexistente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla Pedido");
        }
    }

    //sumamos todos los subtotales de un pedido
    public double sumarSubtotales(int idPedido) {
        double importeTotal = 0;
        String sql = "SELECT SUM(importeUnitario)\n"
                + "FROM (SELECT SUM(pp.cantidad * p.precio) AS importeUnitario\n"
                + "    FROM pedidoproducto pp\n"
                + "    JOIN producto p ON pp.id_producto = p.id_producto\n"
                + "    JOIN pedido pe ON pe.id_pedido = pp.id_pedido WHERE pe.id_pedido = ?)\n"
                + "     AS subquery";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                importeTotal = rs.getDouble(1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla Pedido" + ex.getMessage());
        }
        return importeTotal;
    }

    //actualizamos la columna importe en la tabla pedidos de BDD
    public void actualizarImporte(int idPedido) {
        String sql = "UPDATE pedido SET importe=? WHERE id_Pedido=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, sumarSubtotales(idPedido));
            ps.setInt(2, idPedido);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                // JOptionPane.showMessageDialog(null, "Importe actualizado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla Pedido" + ex.getMessage());
        }
    }
    
    //lista de pedidos en curso, que no han sido cobrados
    public ArrayList<Pedido> listarPedidosActuales() {
        ArrayList<Pedido> pedidosActuales = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE cobrada=0";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("id_mesa")));
                pedido.setMesero(rs.getString("nombre_mesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("cobrada"));
                pedidosActuales.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla " + ex.getMessage());
        }
        return pedidosActuales;
    }

    //lista de pedidos que hayan sido atendidos por un mesero en particular en una fecha
    public ArrayList<Pedido> listarPedidosPorMesero(String mesero, Date fecha) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE nombre_mesero=? AND fecha=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mesero);
            ps.setDate(2, fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("id_mesa")));
                pedido.setMesero(rs.getString("nombre_mesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla " + ex.getMessage());
        }
        return pedidos;
    }

    //lista de pedidos en una fecha en particular
    public ArrayList<Pedido> listarPedidosPorFecha(Date fecha) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE fecha=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("id_mesa")));
                pedido.setMesero(rs.getString("nombre_mesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla " + ex.getMessage());
        }
        return pedidos;
    }

    //lista de pedidos en una fecha, en un rango horario
    public ArrayList<Pedido> listarPedidosPorHora(Date fecha, Time desde, Time hasta) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE fecha=? AND hora BETWEEN ? AND ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, fecha);
            ps.setTime(2, desde);
            ps.setTime(3, hasta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("id_mesa")));
                pedido.setMesero(rs.getString("nombre_mesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla " + ex.getMessage());
        }
        return pedidos;
    }

    //lista de pedidos en un período de fechas elegido por usuario
    public ArrayList<Pedido> listarPedidosPorPeriodo(Date fechaInicio, Date fechaFin) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE fecha BETWEEN ? AND ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, fechaInicio);
            ps.setDate(2, fechaFin);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("id_mesa")));
                pedido.setMesero(rs.getString("nombre_mesero"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEstado(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla " + ex.getMessage());
        }
        return pedidos;
    }

}
