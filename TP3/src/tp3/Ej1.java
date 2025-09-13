/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

public class Ej1 {

   
    
    static class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; // rango asumido 0.0 - 10.0

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }

    public void mostrarInfo() {
        System.out.printf("Estudiante: %s %s | Curso: %s | Calificación: %.2f%n",
                nombre, apellido, curso, calificacion);
    }

    public void subirCalificacion(double puntos) {
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        setCalificacion(this.calificacion - puntos);
    }

    private void setCalificacion(double valor) {
        if (valor < 0.0) {
            this.calificacion = 0.0;
        } else if (valor > 10.0) {
            this.calificacion = 10.0;
        } else {
            this.calificacion = valor;
        }
    }

    // getters (si se necesitan los datos)
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }
}
       
    public static void main(String[] args) {
        System.out.println("=== EJ 1: Registro de Estudiantes ===");
        Estudiante e = new Estudiante("María", "González", "2A", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.2);
        System.out.print("Después de subir: ");
        e.mostrarInfo();
        e.bajarCalificacion(3.0);
        System.out.print("Después de bajar: ");
        e.mostrarInfo();

     
    }
} 

  
