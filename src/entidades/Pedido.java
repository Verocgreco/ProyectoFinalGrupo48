
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author veron
 */
public class Pedido {
    private int idPedido;
    private Mesa mesa; 
    private String mesero;
    private LocalDate fecha;
    private LocalTime hora;
    private double importe;
    private boolean estado;

    public Pedido(int idPedido, Mesa mesa, String mesero, LocalDate fecha, LocalTime hora, double importe, boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.estado = estado;
    }

    public Pedido(Mesa mesa, String mesero, LocalDate fecha, LocalTime hora, double importe, boolean estado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.estado = estado;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido: "+ idPedido + mesa + ", mesero: " + mesero + ", fecha: " + fecha + ", hora: " + hora + ", importe: " + importe + ", estado: " + estado;
    }
    
    

}