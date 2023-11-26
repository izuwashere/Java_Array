
package biblioteca;

import Servicios.servicio;


public class Biblioteca {

    //Vista.
    //El usuario hace sus peticiones.
    public static void main(String[] args) {
        servicio ser = new servicio();
        ser.aumentoL();
        ser.mostrarL();
    }
    
}
