
package modelos;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Producto implements Serializable{
    private int codigo;//actuar como id
    private String nombre;
    private double costo;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double costo, double precio) {
        this.codigo = codigo;
        this.nombre = descripcion;
        this.costo = costo;
        this.precio = precio;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.nombre = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", costo=" + costo + ", precio=" + precio + '}';
    }
    
}
