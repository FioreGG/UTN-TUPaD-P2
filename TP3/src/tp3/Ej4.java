/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;


public class Ej4 {
    
    static class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(String idGallina, int edad){
        this.idGallina = idGallina;
        this.edad = Math.max(0, edad);
        this.huevosPuestos = 0;      
    } 
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.printf("Gallina %s / Edad: %d / Huevos puestos: %d%n",
                idGallina, edad, huevosPuestos);
    }
    
    //getters
    public String getIdGallina(){return idGallina;}
    public int getEdad(){return edad;}
    public int getHuevosPuestos(){return huevosPuestos;}
    
    public static void main(String[] args){
        Gallina g1 = new Gallina("G01",1);
        Gallina g2 = new Gallina("G02",2);
        //simulamos acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();
   
        g1.mostrarEstado();
        g2.mostrarEstado();
    
    }
    
    }
    
    
    
}
