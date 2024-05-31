
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
    private Proveedor proveedor;

    public Producto() {
        
    }

    public Producto(int codigo, String nombre, double costo, double precio, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
}
