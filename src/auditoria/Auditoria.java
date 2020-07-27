/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auditoria;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import modelo.Controlador;

import ventana.Principal_1;

/**
 *
 * @author Yuli
 */
public class Auditoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* for(int i=0;i<50;i++) {
            int n = (int) Math.floor(Math.random()*6+10);
            System.out.println(n);
        }*/
        
       /* for(int i=0;i<50;i++) {
            Random aleatorio;
            aleatorio = new Random();
           Calendar unaFecha = Calendar.getInstance();
        unaFecha.set (2020, aleatorio.nextInt(6)+7, aleatorio.nextInt(30)+1, aleatorio.nextInt(9)+10,0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm a ");
        System.out.println("La fecha vale " + sdf.format(unaFecha.getTime()));
        }*/
        /* Calendar fechaInicio =  Calendar.getInstance();
         fechaInicio.setTimeInMillis( fechaInicio.getTimeInMillis()+(60000*1440)-((fechaInicio.getTime().getHours()*60000*60)+(fechaInicio.getTime().getMinutes()*60000)));
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm a ");
        System.out.println("La fecha vale " + sdf.format(fechaInicio.getTime()));*/
        
        Principal_1 ini = new Principal_1(new Controlador());
        ini.setVisible(true);
        //System.out.println(2%2);
    }
    
}
