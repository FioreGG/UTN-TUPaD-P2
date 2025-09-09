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
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los dos números
        System.out.print("Ingresa el primer numero entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();
        
        // Realizar las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2; // Se usa double para obtener un resultado con decimales
        
        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        
        scanner.close();
    }
}