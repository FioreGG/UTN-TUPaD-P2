/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

public class TP4 {

// Clase Empleado
    static class Empleado {
    // Atributos privados
        private int id;
        private String nombre;
        private String puesto;
        private double salario;
        
    // Atributo estatico
        private static int totalEmpleados = 0;
        private static int nextId = 1; // para asignar ids automaticos
        
    // constructor con todos los atributos
        public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= nextId) {
            nextId = id + 1;
            }
             }
        
        // Constructor con nombre y puesto id automatico y salario por defecto
        
        public Empleado (String nombre, String puesto){
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 500000;
        totalEmpleados++;}
        
        // Metodos sobrecargados para actualizar salario
        
        public void actualizarSalario (double porcentaje){
            this.salario += this.salario*(porcentaje/100);}
        
        public void actualizarSalario(int cantidadFija){
            this.salario+= cantidadFija;}
        
        //Metodo toString
        @Override
        public String toString(){
            return "Empleado [ID=" + id +
                    ", Nombre="+nombre + ", Puesto="+puesto+ ", Salario="+salario+ "]";}
        
        // Metodo estatico para mostrar total empleados
        public static int mostrarTotalEmpleados(){
            return totalEmpleados;}
        
        //Getters y setters
        
        public int getId(){return id;}
        public String getNombre(){return nombre;}
        public String getPuesto(){return puesto;}
        public double getSalario(){return salario;}
        
        public void setNombre(String nombre){this.nombre = nombre;}
        public void setPuesto(String puesto){this.puesto=puesto;}
        public void setSalario(double salario){this.salario = salario;}
        
        //clase de prueba (main)
    }
    public static void main(String[] args) {
        System.out.println("Sistema de gestion de empleados: ");
    
        // Crear empleados con distintos constructores
        Empleado emp1 = new Empleado(1,"Maria Gonzalez", "QA", 750000);
        Empleado emp2 = new Empleado("Juancito Gomez", "Programador");
        Empleado emp3 = new Empleado("Lucia Maria", "Scrum master");
        
        //Mostrar empleados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        // Actualizar salario usando sobrecarga
        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(5000);
        emp3.actualizarSalario(15.0);
        
        //Mostrar empleados actualizados
        System.out.println("--- Después de actualizar salarios ---");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        // Mostrar total de empleados
        System.out.println("Total de empleados creados " +Empleado.mostrarTotalEmpleados());
    }
    
}
