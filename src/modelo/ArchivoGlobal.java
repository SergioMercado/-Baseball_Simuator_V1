package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ArchivoGlobal {
    public static final String RUTA_REGISTRO = "Usuarios.obj";

    /**Metodo estatico escribir.
     * 
     * se guarda toda la información que se encuentra en el almacen virtual en un archivo   
     * llamado "Cuentas.obj", para que pueda ser reutilizada en otros inicios de la aplicación.
     * 
     * @param egg que representa el almacen de la empresa.
     * @param estado que representa la situacion de la aplicacion (final o interior).
     */
    public static void escribir(Programacion egg ) {

        try {
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(RUTA_REGISTRO));
            file.writeObject(egg);
            file.close();
            System.out.println("Archivo escrito exitosamente!!!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    /**Metodo estatico escribir.
     * 
     * se lee toda la información que se encuentra en el archivo llamado "Cuentas.obj" y se introduce 
     * en el almacen virtaul para que pueda ser utilizada la informacion guardada en ejecuciones anteriores.
     * 
     * @param egg que representa el almacen de la empresa.
     * @param estado que representa la situacion de la aplicacion (final o interior).
     * 
     * @return egg
     */
    public static Programacion leer() {
          Programacion egg = null ;
        try {
            try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(ArchivoGlobal.RUTA_REGISTRO))) {

              egg = (Programacion) file.readObject();
                file.close();
                    System.out.println("Archivo recuperado exitosamente!!!");
            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex);
        }
        
        return egg;
    }   
    
}
