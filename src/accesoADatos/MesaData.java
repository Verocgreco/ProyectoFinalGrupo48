
package accesoADatos;

import entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MesaData {
    private Connection conn = null; 
    
     public MesaData() {
        conn = Conexion.getConexion();
    }
     
     
      public Mesa buscarMesa(int idMesa) {
        Mesa mesa = null;
        String sql = "SELECT estado_mesa, capacidad FROM mesa WHERE id_mesa=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(idMesa);
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado_mesa"));
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla mesa" + ex.getMessage());
        }
        return mesa;
    }
       public void ocuparMesa(int idMesa) {
        try {
            String sql = "UPDATE mesa SET estado_mesa=0 WHERE id_mesa=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMesa);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                //JOptionPane.showMessageDialog(null, "Mesa " + idMesa + " ocupada");
            } else {
                JOptionPane.showMessageDialog(null, "No corresponde nro de mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla mesa");
        }
    }

    public void desocuparMesa(int idMesa) {
        try {
            String sql = "UPDATE mesa SET estado_mesa=1 WHERE id_mesa=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMesa);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                // JOptionPane.showMessageDialog(null, "Mesa " + idMesa + " desocupada");
            } else {
                JOptionPane.showMessageDialog(null, "No corresponde nro de mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla mesa");
        }
    }
    public List<Mesa> listarMesasLibres() {
        List<Mesa> mesasLibres = new ArrayList();
        String sql = "SELECT * FROM mesa WHERE estado_mesa=1 ORDER BY id_mesa";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado_mesa"));
                mesasLibres.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla mesa" + ex.getMessage());
        }
        return mesasLibres;
    }

    public List<Mesa> listarMesasOcupadas() {
        List<Mesa> mesasOcupadas = new ArrayList();
        String sql = "SELECT * FROM mesa WHERE estado_mesa=0 ORDER BY id_mesa";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado_mesa"));
                mesasOcupadas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla mesa" + ex.getMessage());
        }
        return mesasOcupadas;
    }

}

 