/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Empleado extends Persona implements Serializable{
    private double salario;
    
    public Empleado(){
        
    }

    public Empleado(double salario, long documento, String nombre, String apellido, String telefono, String direccion, String user, String password) {
        super(documento, nombre, apellido, telefono, direccion, user, password);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado: "+super.toString()+" salario=" + salario + '}'+"\n";
    }
    
    
}
