package accesoADatos;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection conn = null;


    public ProductoData() {
        conn = Conexion.getConexion();
    }

    public void productoNuevo(Producto producto) {
        String sql = "INSERT INTO producto (nombre, descripcion, precio, stock, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, true);

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla producto");
        }
    }

    public void borrarProducto(int id) {
        String sql = "UPDATE producto SET estado=0 WHERE id_producto = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if(fila==1){
              JOptionPane.showMessageDialog(null, "Producto eliminado");
            }else{
                 JOptionPane.showMessageDialog(null, "Producto inexistente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla producto");
        }
    }
    
    public void modificarProducto(Producto producto){
        String sql = "UPDATE producto SET nombre=?, descripcion=?, precio=?, stock=?, estado=? WHERE id_producto=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            
            int fila = ps.executeUpdate();
            if(fila==1){
              JOptionPane.showMessageDialog(null, "Producto modificado");
            }else{
                 JOptionPane.showMessageDialog(null, "Producto inexistente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de acceso a tabla producto");
        }
        
    }
    
    public Producto buscarPorID(int id){
    
    Producto prod =null;
    String sql="SELECT nombre , descripcion , precio , stock,estado FROM producto WHERE id_producto = ? ";

    PreparedStatement ps=null;
        try {
                 ps=conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            prod=new Producto();           
            prod.setIdProducto(id);
            prod.setNombre(rs.getString("nombre"));
            prod.setDescripcion(rs.getString("descripcion"));
            prod.setPrecio(rs.getDouble("precio"));
            prod.setStock(rs.getInt("stock"));
            prod.setEstado(rs.getBoolean("estado"));
           
            }
            ps.close();
            
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error Al Acceder al Tabla Producto"+ex);
        }
        return prod;
    }
    
    public ArrayList<Producto> listaProducto(){
        
        
        ArrayList<Producto> productos= new ArrayList<>();
        
    String sql="SELECT * FROM producto WHERE estado = 1 ORDER BY nombre";
        try {
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Producto prod = new Producto();
            prod.setIdProducto(rs.getInt("id_producto"));
            prod.setNombre(rs.getString("nombre"));
            prod.setDescripcion(rs.getString("descripcion"));
            prod.setPrecio(rs.getDouble("precio"));
            prod.setStock(rs.getInt("stock"));
            prod.setEstado(rs.getBoolean("estado"));
            productos.add(prod);
            
            }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en Acceder Tabla PRODUCTO");
        }
        
        return productos;
}
    
    public ArrayList<Producto> listaProducto2(){
        
        
        ArrayList<Producto> productos= new ArrayList<>();
        
    String sql="SELECT * FROM producto WHERE estado = 0 ORDER BY nombre";
        try {
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Producto prod = new Producto();
            prod.setIdProducto(rs.getInt("id_producto"));
            prod.setNombre(rs.getString("nombre"));
            prod.setDescripcion(rs.getString("descripcion"));
            prod.setPrecio(rs.getDouble("precio"));
            prod.setStock(rs.getInt("stock"));
            prod.setEstado(rs.getBoolean("estado"));
            productos.add(prod);
            
            }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en Acceder Tabla PRODUCTO");
        }
        
        return productos;
}
    
    
    public ArrayList<Producto> listaProducto3(){
        
        
        ArrayList<Producto> productos= new ArrayList<>();
        
    String sql="SELECT * FROM producto WHERE estado BETWEEN 0 AND 1 ORDER BY nombre";
        try {
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Producto prod = new Producto();
            prod.setIdProducto(rs.getInt("id_producto"));
            prod.setNombre(rs.getString("nombre"));
            prod.setDescripcion(rs.getString("descripcion"));
            prod.setPrecio(rs.getDouble("precio"));
            prod.setStock(rs.getInt("stock"));
            prod.setEstado(rs.getBoolean("estado"));
            productos.add(prod);
            
            }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en Acceder Tabla PRODUCTO");
        }
        
        return productos;
}
    
    
    
    
    
    
    
       public ArrayList<Producto> listaProducto4(String nombre){
        
        
        ArrayList<Producto> productos= new ArrayList<>();
        
    String sql="SELECT * FROM producto WHERE estado = 1 AND nombre LIKE ? ORDER BY descripcion";
        try {
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,nombre);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            Producto prod = new Producto();
            
            prod.setIdProducto(rs.getInt("id_producto"));
            prod.setNombre(nombre);
            prod.setDescripcion(rs.getString("descripcion"));
            prod.setPrecio(rs.getDouble("precio"));
            prod.setStock(rs.getInt("stock"));
            prod.setEstado(rs.getBoolean("estado"));
            productos.add(prod);
            
            }
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en Acceder Tabla PRODUCTO");
        }
        
        return productos;
}
    
    
    public Producto buscarPorNombre(String descripcion){
    
    Producto prod =null;
    String sql="SELECT id_producto , nombre, precio , stock,estado FROM producto WHERE descripcion  = ? ";

    PreparedStatement ps=null;
        try {
                 ps=conn.prepareStatement(sql);
            ps.setString(1, descripcion);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            prod=new Producto();           
           
            prod.setIdProducto(rs.getInt("id_producto"));
             prod.setNombre(rs.getString("nombre"));
            prod.setDescripcion(descripcion);
            prod.setPrecio(rs.getDouble("precio"));
            prod.setStock(rs.getInt("stock"));
            prod.setEstado(rs.getBoolean("estado"));
           
            }
            ps.close();
            
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error Al Acceder al Tabla Producto"+ex);
        }
        return prod;
    }
        

}
