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
public class Resultado {
    private int equipo;
    private int carreras;
    private int homeRun;

    public Resultado( int equipo, int carreras, int homeRun) {
        this.equipo = equipo;
        this.carreras = carreras;
        this.homeRun = homeRun;
    }
    
    public Resultado(){
        
    }
    
    
    public Resultado(int equipo){
        this.equipo = equipo;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }

    public int getCarreras() {
        return carreras;
    }

    public void setCarreras(int carreras) {
        this.carreras = carreras;
    }

    public int getHomeRun() {
        return homeRun;
    }

    public void setHomeRun(int homeRun) {
        this.homeRun = homeRun;
    }
    
    
}
