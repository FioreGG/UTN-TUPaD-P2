/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

import java.time.Year;

        
public class Ej3 {
   
    static class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);      
    } 
    
   // getters
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public int getAnioPublicacion(){return anioPublicacion;}
   
    // setter con validacion
    public boolean setAnioPublicacion (int anio){
     int añoActual = Year.now().getValue(); // usa el año actual del sistema
        if (anio > 0 && anio <= añoActual) {
            this.anioPublicacion = anio;
            return true;
        } else {
            System.out.printf("Valor invalido para anioPublicacion: %d (valido: 1 - %d)%n", anio, añoActual);
            return false;
        }
    }

    public void mostrarInfo() {
        System.out.printf("Libro: \"%s\" de %s (%d)%n", titulo, autor, anioPublicacion);
    }
}

    public static void main(String[] args) {
    Libro libro = new Libro("Introduccion a Java", "J. Programador", 2018);
    libro.mostrarInfo();
    System.out.println("Intento setear anio invalido (-500):");
    libro.setAnioPublicacion(-500); // debe fallar
    System.out.println("Intento setear anio valido (2020):");
    libro.setAnioPublicacion(2020); // debe pasar
    libro.mostrarInfo();
}

}
    