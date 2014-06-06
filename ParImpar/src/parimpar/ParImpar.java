/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parimpar;
import java.util.Scanner;

/**
 *
 * @author gerardo
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader= new Scanner(System.in);
        double numero, resto;
        System.out.print("Introduzca un número entero:");
        try{
        numero= reader.nextDouble();
        resto= numero%2;
        
        if (resto == 0){
        System.out.println("El número "+numero+ " es par");
        } 
        
        else
        {
            System.out.println("El número "+numero+ " es impar");
        }
        }  
        catch (Exception exception)
        {
        System.out.println("Porfavor Ingrese un numero");
        }
    }
}