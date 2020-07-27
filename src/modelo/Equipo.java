/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yuli
 */
public class Equipo {
    private int codigo;
    private String nombre;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int carreras;
    private int homeRun;
    private int partidosSemana1;
    private int partidosSemana2;
    
    public Equipo(int codigo, String nombre, int partidosGanados, int partidosPerdidos, int carreras, int homeRun) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.carreras = carreras;
        this.homeRun = homeRun;
        this.partidosSemana1 = 0;
        this.partidosSemana2 = 0;
    }

    public Equipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.partidosSemana1 = 0;
        this.partidosSemana2 = 0;
        this.partidosGanados = 0;
        this.partidosPerdidos = 0;
        this.carreras = 0;
        this.homeRun = 0;
    }

    public Equipo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPartidosSemana2() {
        return partidosSemana2;
    }

    public void setPartidosSemana2(int partidosSemana2) {
        this.partidosSemana2 = partidosSemana2;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosSemana1() {
        return partidosSemana1;
    }

    public void setPartidosSemana1(int partidosSemana1) {
        this.partidosSemana1 = partidosSemana1;
    }
    
 
    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
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

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", partidosGanados=" + partidosGanados + ", partidosPerdidos=" + partidosPerdidos + ", partidosEmpatados=" + partidosEmpatados + ", carreras=" + carreras + ", homeRun=" + homeRun + ", partidosSemana1=" + partidosSemana1 + ", partidosSemana2=" + partidosSemana2 + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
