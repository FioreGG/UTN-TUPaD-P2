/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

public class Ej2 {

static class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
public Mascota (String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(0, edad);
    }

public void mostrarInfo() {
System.out.printf("Mascota: %s | Especie: %s | Edad: %d anios%n", nombre, especie, edad);
}

public void cumplirAnios () {
this.edad++;
}

//getters
public String getNombre(){return nombre;}
public String getEspecie(){return especie;}
public int getEdad(){return edad;}
}

public static void main(String[] args) {
    Mascota m = new Mascota("Luna", "Perro", 2);
    m.mostrarInfo();
    System.out.println("Pasa un anio...");
    m.cumplirAnios();
    m.mostrarInfo();
}
}