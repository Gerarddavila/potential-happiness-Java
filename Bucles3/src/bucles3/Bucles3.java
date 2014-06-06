/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bucles3;
import java.util.Scanner;

/**
 *
 * @author gerardo
 */
public class Bucles3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws InterruptedException{
        // TODO code application logic here
               
        Scanner reader=new Scanner (System.in);
        int segundos;
        System.out.print("Introduzca el numero de segundos de espera: ");
        segundos=reader.nextInt();
        for (int i= segundos-1; i>=0;i--){
         Thread.sleep(1000); // se escribe en milisegundos
         System.out.print(" - "+i);
          }
        System.out.println("\n La cuenta ha llegado a su fin!");
    }
}
