/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_adicionales_poo;

public class Alumnos {
 // Clase Alumnos - Caso practico 2
    static class Alumno {
    // Atributos privados
        private String nombre;
        private double promedio;
        
    // Atributo estatico
        private static double notaAprobacion = 6;
                
    // constructor 
        public Alumno(String nombre){
        this.nombre = nombre;
        this.promedio = 0;
            }
                 
    // Constructor con nombre y promedio
        
        public Alumno (String nombre, double promedio){
        this.nombre = nombre;
        this.promedio = promedio;
        }
        
        // Metodos sobrecargados actualizarPromedio
        
        public void actualizarPromedio (double nuevoPromedio){
            this.promedio = nuevoPromedio;}
        
        
        public void actualizarPromedio(double [] notas){
        double suma = 0;
        for (double n : notas){
        suma += n;}
        this.promedio = notas.length > 0 ? suma / notas.length : 0;}
        
        public boolean aprobo(){
        return this.promedio >= notaAprobacion;}
        
        
        public static void cambiarNotaAprobacion(double nueva){
        notaAprobacion = nueva;}
        
        @Override
        
        public String toString(){
            return "Alumno [Nombre =" + nombre +
                    ", Promedio ="+promedio + ", Aprobo?? ="+ (aprobo() ? "Si":"No")+"]";}
        
              
      

    }
    public static void main(String[] args) {
        System.out.println("Alumnos - Ej 2 ");
    
        // Crear alumnos 
        Alumno a1 = new Alumno("Soledad");
        Alumno a2 = new Alumno("Roberto", 8.5);
        
        //Mostrar alumnoss
        System.out.println(a1);
        System.out.println(a2);
        
        // Actualizar promedio 
        a1.actualizarPromedio(9.0);
        a2.actualizarPromedio(new double []{4,6,7});
        
        
               
        //Mostrar alumnos actualizados
        System.out.println("--- Despues de actualizar notas ---");
        System.out.println(a1);
        System.out.println(a2);
        
        
    }
    
}

   
