/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_adicionales_poo;


public class Ej_Adicionales_POO {

// Clase Libro - Caso practico 1
    static class Libros {
    // Atributos privados
        private String titulo;
        private String autor;
        
    // Atributo estatico
        private static String editorial = "Independiente";
                
    // constructor con titulo y autor
        public Libros(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
            }
             
        
        // Constructor con titulo, autor y editorial 
        
        public Libros (String titulo, String autor, String editorial){
        this.titulo = titulo;
        this.autor = autor;
        Libros.editorial = editorial;
        }
        
        // Metodos sobrecargados actualizarTitulo
        
        public void actualizarTitulo (String nuevoTitulo){
            this.titulo = nuevoTitulo;}
        
        
        public void actualizarTitulo(String prefijo, String nuevoTitulo){
        this.titulo = prefijo + "" + nuevoTitulo;}
        
        public static void cambiarEditorial(String nueva){
        editorial = nueva;}
        
        @Override
        
        public String toString(){
            return "Libro [Titulo=" + titulo +
                    ", Autor="+autor + ", Editorial="+editorial+ "]";}
        
       
        //Getters y setters
        
      
        public String getTitulo(){return titulo;}
        public String getAutor(){return autor;}
        public String getEditorial(){return editorial;}
        
        public void setTitulo(String titulo){this.titulo = titulo;}
        public void setAutor(String autor){this.autor = autor;}
        public void setEditorial(String editorial){this.editorial = editorial;}
        
        //clase de prueba (main)
    }
    public static void main(String[] args) {
        System.out.println("Libros - Ej 1 ");
    
        // Crear libros 
        Libros l1 = new Libros("Cien Anos de Soledad", "Gabriel Garcia Marquez");
        Libros l2 = new Libros("Tres pastores", "Luciana Garcia");
        
        //Mostrar libros
        System.out.println(l1);
        System.out.println(l2);
        
        // Actualizar titulo 
        l2.actualizarTitulo("Pastorcito mentiroso");
        l1.actualizarTitulo("Edicion Especial ", "Cien anos de Soledad");
        
        //Actualizar editorial
        Libros.cambiarEditorial("Planeta");
        
        
        //Mostrar titulos actualizados
        System.out.println("--- Despues de actualizar titulos ---");
        System.out.println(l1);
        System.out.println(l2);
        
        
    }
    
}

