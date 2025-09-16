/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_adicionales_poo;


public class Productos {
    
    // Clase Producto - Caso practico 3
    static class Producto {
    // Atributos privados
        private String nombre;
        private double precioBase;
        
    // Atributo estatico
        private static double IVA = 0.21;
                
    // constructor con nombre y precioBase
        public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
            }
                 
    // Constructor con nombre solamente
        
        public Producto (String nombre){
        this.nombre = nombre;
        this.precioBase = 100000;
        }
        
        // Metodos sobrecargados aplicarDescuento
        
        public void aplicarDescuento (double porcentaje){
            precioBase -= precioBase * (porcentaje/100);}
        
        
        public void aplicarDescuento(double porcentaje, double precioMinimo){
        double descuento = precioBase*(porcentaje/100);
        double nuevoPrecio = precioBase - descuento;
        if (nuevoPrecio < precioMinimo){
            precioBase = precioMinimo;
        } else {
            precioBase = nuevoPrecio;}
        }
        
        public double calcularPrecioFinal(){
            return precioBase * (1+IVA);}
        
        public static void cambiarIVA(double nuevo){
            IVA = nuevo;}
        
        @Override
        
        public String toString(){
            return "Producto [Nombre = " + nombre +
                    ", Precio Base = "+precioBase + " Precio Final con IVA " + calcularPrecioFinal()+ "]";}
        
              
      

    }
    public static void main(String[] args) {
        System.out.println("Productos - Ej 2 ");
    
        // Crear productos 
        Producto p1 = new Producto("Mesa carpintera");
        Producto p2 = new Producto("Tablon de 7", 85000.5);
        
        //Mostrar productos
        System.out.println(p1);
        System.out.println(p2);
        
        //Aplicar descuentos
        
        p1.aplicarDescuento(50);
        p2.aplicarDescuento(5, 550000);
          //Mostrar productos
        System.out.println("Productos con descuentos ");  
        System.out.println(p1);
        System.out.println(p2);
        
        // Actualizar IVA
        Producto.cambiarIVA(0.09);
       
        
        
               
        //Mostrar productos actualizados
        System.out.println("--- Despues de actualizar IVA ---");
        System.out.println(p1);
        System.out.println(p2);
        
        
    }
    
}
