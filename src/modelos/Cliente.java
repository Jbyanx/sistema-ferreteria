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
public class Cliente extends Persona implements Serializable{
    private double saldo;

    public Cliente(){
        
    }
    
    public Cliente(double saldo, long documento, String nombre, String apellido, String telefono, String direccion, String user, String password) {
        super(documento, nombre, apellido, telefono, direccion, user, password);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente: "+super.toString()+ "saldo=" + saldo + '}'+"\n";
    }

    
}
