/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6wilmerjosue11511242;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class Clientes {
    private String nombre;
    private int numero;
    private double dinero;
    private String direccion;
    private ArrayList<String> lista= new ArrayList();

    public Clientes() {
    }

    public Clientes(String nombre, int numero, double dinero, String direccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.dinero = dinero;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Clientes:  "+ nombre + ", numero=";
    }
    
}
