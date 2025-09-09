/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author fiore
 */
public class Divisiones {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el primer numero: ");
    int num1 = scanner.nextInt();
    System.out.print("Ingresa el segundo numero:");
    int num2 = scanner.nextInt();
    int resultado = num1/num2;
    System.out.println("Resultado de la division: " + resultado);
    scanner.close();
    }
}
