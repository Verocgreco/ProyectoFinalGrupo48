
package accesoADatos;

import entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}

 