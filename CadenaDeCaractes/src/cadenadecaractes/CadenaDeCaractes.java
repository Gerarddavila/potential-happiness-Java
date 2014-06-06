/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadenadecaractes;
import java.util.Scanner;

/**
 *
 * @author gerardo
 */
public class CadenaDeCaractes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader=new Scanner(System.in);
        int edad1, edad2, altura1, altura2;
        String nombre1, nombre2;
        
        System.out.println("DATOS DE LA PRIMERA PERSONA");
        System.out.print("Nombre: ");
        nombre1=reader.next();
        System.out.print("Edad: ");
        edad1=reader.nextInt();
        System.out.print("Altura (cm): ");
        altura1=reader.nextInt();
        //DATOS SEGUNDA PERSONA        
        System.out.println("DATOS DE LA SEGUNDA PERSONA");
        System.out.print("Nombre: ");
        nombre2=reader.next();
        System.out.print("Edad: ");
        edad2=reader.nextInt();
        System.out.print("Altura (cm): ");
        altura2=reader.nextInt();
        
        //Introduzco una linea en blanco
        System.out.println(" ");
        //Comparacion de  alturas
        if (altura1==altura2) {
            System.out.println(nombre1+ " y "+nombre2+"tienen la misma estatura");         
        } else if (altura1>altura2) {
            System.out.println(nombre1+"mide mas que "+nombre2 +". ");          
        } else System.out.println(nombre2+ " mide mas que "+nombre1+" . "); 
        
        //comparacion edades
        
        if(edad1==edad2){
             System.out.println(nombre1+"y "+nombre2+"tienen la misma edad.");
        } else if (edad1>edad2) {
            System.out.println(nombre1+" es mayor que "+ nombre2+" . ");
            } else System.out.println(nombre2+ "es mayor que "+nombre1+" . ");         
        
        
        

        
        
        
    }
    
}
