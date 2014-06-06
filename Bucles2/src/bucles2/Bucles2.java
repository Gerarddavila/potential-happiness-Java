/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bucles2;
import java.util.Scanner;


/**
 *
 * @author gerardo
 */
public class Bucles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        // TODO code application logic 
        Scanner reader = new Scanner (System.in);
        int segundos;
        System.out.print("Introduzca el numero de seguntos de espera: ");
        segundos=reader.nextInt();
        System.out.print(segundos);
        do{
        segundos-=1;
        Thread.sleep(1000);
        System.out.print(" - "+segundos);     
        }while(segundos!=0);
        System.out.println("\n La cuenta ha llegado a su fin !");
    }
    
}
