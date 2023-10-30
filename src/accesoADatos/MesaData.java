
package accesoADatos;

import entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class MesaData {
    private Connection conn = null; 
    
     public MesaData() {
        conn = Conexion.getConexion();
    }
     
     
     
     
         public void mesaNueva(Mesa mesa){
    
        String sql="INSERT INTO mesa (estado_mesa , capacidad) VALUES (?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1,true);
            ps.setInt(2, mesa.getCapacidad());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Agregada con EXITO " +mesa.getIdMesa());
            }
            
            
            ps.close();
            
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al Acceder ala BASE MESA"+ ex.getMessage());
        }
        
    }
             public void cambiarCapacidad(Mesa mesa){
    String sql="UPDATE mesa SET capacidad=? WHERE  id_mesa =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,mesa.getCapacidad());
            ps.setInt(2, mesa.getIdMesa());
            
            int fila = ps.executeUpdate();
            if(fila==1){
            
            JOptionPane.showMessageDialog(null, "Capacidad de la Mesa "+mesa.getIdMesa()
                    +"ahora es de "+mesa.getCapacidad());
            
            }
           
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder ala TABLA MESA");
        }
    
    
    
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
      
          public void borrarMesa(int id){
    
        String sql="DELETE FROM mesa WHERE id_mesa=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            
            int fila= ps.executeUpdate();
            
            if(fila==1){
            
            JOptionPane.showMessageDialog(null, "Se OCUPO la mesa Nro "+id);
            }
            
            
            
            ps.close();
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Error al Acceder ala TABLA MESA");
        }
        
    
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
        String sql = "SELECT * FROM mesa WHERE estado_mesa = 1 ORDER BY id_mesa";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(true);
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
    
    
            public ArrayList<Mesa> mesasTotales(){
        ArrayList<Mesa> mesas= new ArrayList<>();
        
        String sql ="SELECT * FROM mesa WHERE estado_mesa BETWEEN 0 AND 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Mesa mes = new Mesa();
            mes.setIdMesa(rs.getInt("id_mesa"));
            mes.setCapacidad(rs.getInt("capacidad"));
            mes.setEstado(rs.getBoolean("estado_mesa"));
            mesas.add(mes);
            
            }
                      ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error Al Acceder ala Tabla MESA");
        }
        
        
        return mesas;
}

}

 