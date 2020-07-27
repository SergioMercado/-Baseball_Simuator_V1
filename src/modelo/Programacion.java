/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Yuli
 */
public class Programacion {
    private Calendar fechaInicio;
    private ArrayList<Juego> juegos ;

    public Programacion() {
        this.juegos = new ArrayList<Juego>();
        this.fechaInicio = fechaInicio.getInstance();
        fechaInicio.setTimeInMillis( fechaInicio.getTimeInMillis()+(60000*1440)-((fechaInicio.getTime().getHours()*60000*60)+(fechaInicio.getTime().getMinutes()*60000)));
    
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }
    
   
    
    /*public void inicio (){
        Random aleatorio;
        aleatorio = new Random();
      fechaInicio.set(2020, aleatorio.nextInt(6)+7, aleatorio.nextInt(30)+1, aleatorio.nextInt(8)+1,aleatorio.nextInt(10)+8,0);
    }*/

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

 
    
    
    
}
