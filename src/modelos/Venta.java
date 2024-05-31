/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Venta implements Serializable{
    private long id;
    private ArrayList<Producto> productos;
    private double precioTotal;
    private Cliente cliente;
    
    public Venta(){
        
    }

    public Venta(long id, ArrayList<Producto> productos, double precioTotal, Cliente cliente) {
        this.id = id;
        this.productos = productos;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
    }

    
    public void agregarProductoVenta(Producto p){
        productos.add(p);
    }

    public boolean eliminarProductoventa(Producto p){
        return productos.remove(p);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", productos=" + productos + ", precioTotal=" + precioTotal + ", cliente=" + cliente + '}';
    }
    
}
