/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

public class Ej5 {
    
    static class NaveEspacial{
    private String nombre;
    private double combustible;
    private final double capacidad_max = 100; //ejemplo de limite de la nave
    private final double consumo_por_distancia = 1;
    private final double consumo_despegue = 10;
    
    public NaveEspacial(String nombre, double combustibleInicial){
    this.nombre = nombre;
    this.combustible = Math.max(0,Math.min(combustibleInicial, capacidad_max));}
    
    
    public boolean despegar(){
        if (combustible >= consumo_despegue){
        combustible-= consumo_despegue;
        System.out.printf("La nave %s despego. Combustible restante: %.2f%n",nombre, combustible);
        return true;
        } else {
        System.out.printf("No hay suficiente combustible para despegar (se necesitan %.2f). Combustible actual: %.2f%n\",\n",
                    consumo_despegue, combustible);
            return false;
        }
        }
    
    public boolean avanzar (double distancia){
        double requerido = distancia * consumo_por_distancia;
        if (requerido <= combustible) {
            combustible -= requerido;
            System.out.printf("La nave %s avanzo %.2f unidades. Combustible restante: %.2f%n",
                    nombre, distancia, combustible);
            return true;
        } else {
            System.out.printf("No hay suficiente combustible para avanzar %.2f unidades (requiere %.2f, hay %.2f).%n",
                    distancia, requerido, combustible);
            return false;
        }
    }
    
     public boolean recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad a recargar debe ser positiva.");
            return false;
        }
        if (combustible + cantidad > capacidad_max) {
            System.out.printf("No se puede recargar %.2f: excede la capacidad máxima (%.2f). Combustible actual: %.2f%n",
                    cantidad, capacidad_max, combustible);
            return false;
        }
        combustible += cantidad;
        System.out.printf("Recargados %.2f unidades. Combustible actual: %.2f%n", cantidad, combustible);
        return true;
    }

    public void mostrarEstado() {
        System.out.printf("Nave: %s | Combustible: %.2f/%.2f%n", nombre, combustible, capacidad_max);
    }

    // getters
    public String getNombre() { return nombre; }
    public double getCombustible() { return combustible; }
   
    
    public static void main(String[] args){
        NaveEspacial nave = new NaveEspacial("Aurora", 50.0); // según enunciado
        nave.mostrarEstado();
        System.out.println("Intento avanzar 60 unidades sin recargar:");
        nave.avanzar(60); // debería fallar
        System.out.println("Intento despegar:");
        nave.despegar(); // si hay >= 10 unidades consumirá 10
        System.out.println("Recargo 40 unidades:");
        nave.recargarCombustible(40); // intentar recargar
        System.out.println("Ahora intento avanzar 60 unidades:");
        nave.avanzar(60); // ahora puede ser posible
        nave.mostrarEstado();
    }
}}


