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
public class EntradaDatos {
    public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario    
    Scanner scanner = new Scanner(System.in);
    //Solicitar el nombre
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine();
    //Solicitar la edad
    System.out.print("Ingresa tu edad: ");
    int edad = scanner.nextInt();
    
    //Mostrar los datos ingresados
    System.out.println("Hola, " + nombre + ". Tienes " + edad + " anos.");
    
    //Cerrar el objeto scanner
    scanner.close();
    
    }
}
