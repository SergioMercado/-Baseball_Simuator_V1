/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Yuli
 */
public class Juego {
     private Calendar Fecha;
     private Resultado r1;
     private Resultado r2;
     private int ganador;
     private int perdedor;


    public Juego(Calendar Fecha, Resultado r1, Resultado r2) {
        this.Fecha = Calendar.getInstance();
        this.Fecha.setTimeInMillis(Fecha.getTimeInMillis()); 
        this.r1 = r1;
        this.r2 = r2;
        ganador();
    }
    
    public Juego(Juego juego){
      
    }
            
    public Juego(Calendar Fecha) {
        this.Fecha = Calendar.getInstance();
        this.Fecha.setTimeInMillis(Fecha.getTimeInMillis()); 
        this.r1 = new Resultado();
        this.r2 = new Resultado();
    }

    public void hola(){
        
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public Resultado getR1() {
        return r1;
    }

    public void setR1(Resultado r1) {
        this.r1 = r1;
    }

    public Resultado getR2() {
        return r2;
    }

    public int getGanador() {
        return ganador;
    }

    public int getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(int perdedor) {
        this.perdedor = perdedor;
    }


    
    
    public void setGanador(int ganador) {
        this.ganador = ganador;
    }
    
    

    public void setR2(Resultado r2) {
        this.r2 = r2;
    }
 
    public void ganador(){
        if(r1.getCarreras()>r2.getCarreras()){
            ganador = r1.getEquipo();
            perdedor = r2.getEquipo();
        }
        else if(r1.getCarreras()<r2.getCarreras()){
           ganador = r2.getEquipo();
           perdedor = r1.getEquipo();
        }else{
            ganador = 5;
            perdedor=5;
        }
    }
 
}
