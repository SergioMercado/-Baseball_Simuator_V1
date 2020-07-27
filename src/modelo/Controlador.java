/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Yuli
 */
public class Controlador {
   private Programacion informacion;
   private Equipo[] equipos;
   private int juegos;
   int semana;
   int ronda;

    public Controlador() {
        informacion  = new Programacion();
        equipos = generaEquipo();
        juegos=1;
        semana=1;
        ronda=1;
    }

    public Programacion getInfo() {
        return informacion;
    }

    public Programacion getInformacion() {
        return informacion;
    }

    public void setInformacion(Programacion informacion) {
        this.informacion = informacion;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public void setInfo(Programacion info) {
        this.informacion = info;
    }
    
    public void generarJuego(){
            Calendar fechaJuego;
            Random aleatorio;
            aleatorio = new Random();
            int e1,e2,partidos1,partidos2,aux;
            fechaJuego = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm a ");
            aux = 0;
            System.out.println("Fecha de inicio de liga: " + sdf.format(informacion.getFechaInicio().getTime()));
            int i=1;
            int j=0;
            while(ronda<5){
                while(true){
                    e1 =  (int) Math.floor(Math.random()*4);
                    e2 = aleatorio.nextInt(5);    
                    System.out.println("Equipo 1: "+e1);
                    System.out.println("Equipo 2: "+e2);
                    if(semana==1){
                        partidos1 = equipos[e1].getPartidosSemana1();
                        partidos2 = equipos[e2].getPartidosSemana1();
                    }else{
                        partidos1 = equipos[e1].getPartidosSemana2();
                        partidos2 = equipos[e2].getPartidosSemana2();
                        }
                        if(partidos2!=4 && e2!=e1 && partidos1!=4 && !equiposEnfrentados(e1,e2) ){
                            System.out.println("entra");
                            Juego juego = new Juego(fechaJuego,generaResultado(e1),generaResultado(e2));
                            ganadorPerdedor(juego);
                            informacion.getJuegos().add(juego);
                            aux= juegos;
                            if(juegos%2==0)
                                validaFecha(fechaJuego);     
                            fechaJuego.setTimeInMillis(fechaJuego.getTimeInMillis()+(60000*60*8)); 
                            if(juegos==11){
                                semana=2;
                            }
                            System.out.println("\nJuegos hasta aquí\n"+juegos);
                            juegos++;
                             
                        }
                        if(juegos==5*ronda+1){
                            System.out.println("\npaso ronda 2\n"+informacion.getJuegos().size());
                            break;
                        } 
                }
                ronda++;
            }   
    }
    
    
    public void ganadorPerdedor(Juego juego){
        int ganador = juego.getGanador();
        int perdedor = juego.getPerdedor();
        if(ganador!=5){
            equipos[ganador].setPartidosGanados(equipos[ganador].getPartidosGanados()+1);
            equipos[perdedor].setPartidosPerdidos(equipos[perdedor].getPartidosPerdidos()+1);
        }else{
            equipos[juego.getR1().getEquipo()].setPartidosEmpatados(equipos[juego.getR1().getEquipo()].getPartidosEmpatados()+1);
            equipos[juego.getR2().getEquipo()].setPartidosEmpatados(equipos[juego.getR2().getEquipo()].getPartidosEmpatados()+1);
        }
    }
    
    
    public boolean equiposEnfrentados(int e1,  int  e2){
        int avisa =0;
        for(int i=0;i<informacion.getJuegos().size();i++){
            Juego juego = informacion.getJuegos().get(i);
            if((juego.getR1().getEquipo()==e1 & juego.getR2().getEquipo()==e2)  ||  (juego.getR1().getEquipo()==e2 & juego.getR2().getEquipo()==e1))
                avisa++;
            }
        if(juegos*ronda<=10){
            if(avisa==1)
                return true;
            else{
                return false;
            }
        }else{
          if(avisa==2)
                return true;
            else{
                return false;
            }
        }
    }
 
    public void validaFecha(Calendar fechaJuego){
        while(true){
            fechaJuego.setTimeInMillis(fechaJuego.getTimeInMillis()+(60000*1440)-((fechaJuego.getTime().getHours()*60000*60)+(fechaJuego.getTime().getMinutes()*60000))); 
            if(fechaJuego.getTime().getDay() != 0  && fechaJuego.getTime().getDay() != 4)
                return;
        }
    }
    
    public Resultado generaResultado(int equipo){
        Random carreras;
        Random homeRun;
        carreras = new Random();
        homeRun = new Random();
        int ncarreras, nhomerun;
        nhomerun = homeRun.nextInt(6);
         ncarreras = carreras.nextInt(11)+nhomerun;
        equipos[equipo].setCarreras(ncarreras+ equipos[equipo].getCarreras());
        equipos[equipo].setHomeRun(nhomerun+ equipos[equipo].getHomeRun());
        return new Resultado(equipo,ncarreras, nhomerun);
    }
    
    public Calendar generaFecha(){
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        Calendar unaFecha = Calendar.getInstance();
        while(true){        
        }
    }
    
    public Equipo[] generaEquipo(){
        Equipo e1 = new Equipo(1,"Tejones");
        Equipo e2 = new Equipo(2,"Mayorcas");
        Equipo e3 = new Equipo(3,"Martillos");
        Equipo e4 = new Equipo(4,"Canibales");
        Equipo e5 = new Equipo(5,"Leones");
        Equipo[] vector = {e1,e2,e3,e4,e5};
        return vector;
    }
    
    public Equipo[] organizaEquipos(){
        Equipo[] equiposOrganizados = new Equipo[5];
        Equipo aux;
        System.out.println(equipos.toString());
        for(int i=0; i<5; i++){
            System.out.println(equipos[i].toString());
            equiposOrganizados[i] = equipos[i];
        }
        
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5 ; j++){
               if(equiposOrganizados[i].getCarreras()<equiposOrganizados[j].getCarreras()){
                   aux = equiposOrganizados[i];
                   equiposOrganizados[i] = equiposOrganizados[j];
                   equiposOrganizados[j] = aux;
               }else{
                   if(equiposOrganizados[i].getCarreras()==equiposOrganizados[j].getCarreras()){
                        if(equiposOrganizados[i].getHomeRun()<equiposOrganizados[j].getHomeRun()){
                            aux = equiposOrganizados[i];
                            equiposOrganizados[i] = equiposOrganizados[j];
                            equiposOrganizados[j] = aux;
                        }
                   } 
            }
            
        }
       
    }
        return equiposOrganizados;
    }   

    
}


  
    
