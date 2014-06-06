/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areatriangulo;
import java.util.Scanner;
/**
 *
 * @author gerardo
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer_de_teclado= new Scanner(System.in);
        double base, altura;
        double area;
        System.out.print("Introduzca el valor de la base (metros): ");
        base= leer_de_teclado.nextDouble();
        System.out.print("Introduzca el valor de la altura (metros): ");
        altura= leer_de_teclado.nextDouble();
        area=(base*altura)/2;
        System.out.println("El área del triángulo es: "+area+"m²");
             
    }
    
}
