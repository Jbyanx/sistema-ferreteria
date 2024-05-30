/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.Serializable;
import java.util.ArrayList;
import modelos.Cliente;
import modelos.Persona;
import modelos.Proveedor;
import modelos.Venta;

/**
 *
 * @author HP
 */
public class Ferreteria implements Serializable{
    private long RUT;
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<Venta> ventas;
    private ArrayList<Persona> personas;
    private ArrayList<Proveedor> proveedores;

    public Ferreteria() {
        this.ventas = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    public Ferreteria(long RUT, String nombre, String telefono, String direccion) {
        this.RUT = RUT;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        
        this.ventas = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    public void agregarCliente(Cliente c){
        personas.add(c);
    }
    
    public long getRUT() {
        return RUT;
    }

    public void setRUT(long RUT) {
        this.RUT = RUT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Ferreteria{" + "RUT=" + RUT + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    
}