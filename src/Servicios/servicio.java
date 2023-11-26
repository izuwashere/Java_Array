
package Servicios;

import Entidad.libro;
import java.util.Scanner;

//Donde se hace todas las operaciones y peticiones del usuario.
public class servicio {
    Scanner leer = new Scanner (System.in); 

    //Es donde se guarda la información de la array
    int i;
    
     //Creacion de la array
    libro [] libross = new libro [50]; 
    
    //Petición de cantidad
    public void aumentoL(){
        System.out.println("Buenas tardes");
        System.out.println("");
        System.out.println("Ingresar cantidad de libros");
        int cantidad = leer.nextInt();
        
        //Creamos condición para validar que el usuario ingreso el valor de los
        //libros
        if (cantidad <=0){ //Condición
            System.out.println("Debbe ingresar una cantidad de libros");
        }else {
            libross = new libro[cantidad];
            
            //Creamos un ciclo para almacenar la información,
            //para que se guarde la información de cada libro.
            for (int x = 0; x < cantidad; x++){ 
            libross[i] = new libro();
                System.out.println("Ingresar los datos del libros");
                System.out.println("Ingresar SIBN");
                libross[i].setSibn(leer.nextInt());
                leer.nextLine();
                System.out.println("");
                System.out.println("Ingresar el titulo");
                libross[i].setTitulo(leer.nextLine());
                System.out.println("");
                System.out.println("Ingresar nombre del autor");
                libross[i].setAutor(leer.nextLine());
                System.out.println("");
                System.out.println("Ingresar la cantidad de paginas");
                libross[i].setNumP(leer.nextInt());
            }
        }

    }//Fin void
    
    //Metodo para mostar información separada
     public void mostrarL(){
        
        //Condición
         if (libross == null || libross.length == 0){
             System.out.println("No se encuentran libros");
         }else{
             System.out.println("Libros ingresados");

            //Ciclo para que cada dato este con su repectivo usuario
             for (int o = 0; o < libross.length; o++){
                 System.out.println("Libro" + (o+1) + ":");
                 System.out.println("Los datos de los libros son:");
        System.out.println("");
        System.out.println("Su SIBN es:" + libross[i].getSibn());
         System.out.println("");
        System.out.println("Los titulos son:" + libross[i].getTitulo());
         System.out.println("");
        System.out.println("Los autores son:" + libross[i].getAutor());
         System.out.println("");
        System.out.println("Los numeros de pagina son" + libross[i].getNumP());
             }
         } 
    }//Fin void
}    

