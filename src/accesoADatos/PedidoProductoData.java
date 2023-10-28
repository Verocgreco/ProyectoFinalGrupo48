package accesoADatos;

import entidades.Pedido;
import entidades.PedidoProducto;
import entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PedidoProductoData {

    private Connection conn = null;
    private PedidoData pedData = new PedidoData();
    private ProductoData prodData = new ProductoData();

    public PedidoProductoData() {
        conn = Conexion.getConexion();
    }

    //agrega un producto al pedido
    public void nuevoPedidoProducto(PedidoProducto pedProd) {
        String sql = "INSERT INTO pedidoproducto (id_pedido, id_producto, cantidad) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedProd.getPedido().getIdPedido());
            ps.setInt(2, pedProd.getProducto().getIdProducto());
            ps.setInt(3, pedProd.getCantidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedProd.setIdPedidoProd(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "Movimiento registrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla" + ex.getMessage());
        }
    }

    //elimina un producto de un pedido
    public void eliminarPedidoProducto(int idPedidoProd) {
        String sql = "DELETE FROM pedidoproducto WHERE id_pedidoprod=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPedidoProd);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                //JOptionPane.showMessageDialog(null, "Movimiento eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla");
        }
    }

    //calcula el importe por cantidad de producto consumido
    public double calcularSubtotal(int id_pedidoprod) {
        double importeUnitario = 0;
        String sql = "SELECT SUM (pp.cantidad * p.precio) FROM pedidoproducto pp JOIN producto p "
                + "ON pp.id_producto = p.id_producto WHERE id_pedidoprod=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id_pedidoprod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                importeUnitario = rs.getDouble(1);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla" + ex.getMessage());
        }
        return importeUnitario;

    }

    //lista los productos de un pedido
    public ArrayList<PedidoProducto> listarProductosPorPedido(int idPedido) {
        ArrayList<PedidoProducto> listaProductosPorPedido = new ArrayList<>();
        String sql = "SELECT id_pedidoprod, id_pedido, id_producto, cantidad FROM pedidoproducto WHERE id_pedido=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PedidoProducto pp = new PedidoProducto();
                pp.setIdPedidoProd(rs.getInt("id_pedidoprod"));
                Pedido pedido = pedData.buscarPedido(idPedido);
                pp.setPedido(pedido);
                Producto producto = prodData.buscarPorID(rs.getInt("id_producto"));
                pp.setProducto(producto);
                pp.setCantidad(rs.getInt("cantidad"));
                listaProductosPorPedido.add(pp);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla" + ex.getMessage());
        }
        return listaProductosPorPedido;
    }
    //consumo de un producto en un período de tiempo elegido por el usuario
    public int productosXPeriodo(int id, Date fecha1, Date fecha2) {
        int consumo = 0;
        String sql = "SELECT SUM(cantidad) FROM pedidoproducto pp JOIN producto p "
                + "ON pp.id_producto=p.id_producto JOIN pedido pe ON pe.id_pedido=pp.id_pedido "
                + "WHERE p.id_producto=? AND pe.fecha BETWEEN ? AND ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setDate(2, fecha1);
            ps.setDate(3, fecha2);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                consumo = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla" + ex.getMessage());
        }
        return consumo;
    }
}
