/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6wilmerjosue11511242;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author macbookpro
 */
public class Ordenes {
    private int numeroorden;
    private SimpleDateFormat hora;
    private SimpleDateFormat dia;
    private int persona;

    public Ordenes(int numeroorden, SimpleDateFormat hora, SimpleDateFormat dia, int persona) {
        this.numeroorden = numeroorden;
        this.hora = hora;
        this.dia = dia;
        this.persona = persona;
    }

    public int getNumeroorden() {
        return numeroorden;
    }

    public void setNumeroorden(int numeroorden) {
        this.numeroorden = numeroorden;
    }

    public SimpleDateFormat getHora() {
        return hora;
    }

    public void setHora(SimpleDateFormat hora) {
        this.hora = hora;
    }

    public SimpleDateFormat getDia() {
        return dia;
    }

    public void setDia(SimpleDateFormat dia) {
        this.dia = dia;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "numeroorden=" + numeroorden + ", hora=" + hora + ", dia=" + dia + ", persona=" + persona + '}';
    }

    

    
    
    
}
