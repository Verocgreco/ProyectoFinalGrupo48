
package entidades;

/**
 *
 * @author veron
 */
public class Mesa {
   private int idMesa;
   private int capacidad;
   private boolean estado;

    public Mesa(int idMesa, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int capacidad, boolean estado) {
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa() {
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa: " + idMesa + ", capacidad: " + capacidad;
    }
   
   
}
