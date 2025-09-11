/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author fiore
 */
public class TP2 {
    //Ejercicio 1
    public static void  ejercicio1(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el valor del anio: ");
    int anio = scanner.nextInt();
    if ((anio %4==0 && anio % 100 !=0) || (anio % 400 == 0)) {
        System.out.println("El anio " + anio + " es bisiesto. ");
    } else {
        System.out.println("El anio: " + anio + " no es bisiesto. ");
        
    }
    }

    //Ejercicio 2 - Determinar el mayor de tres numeros
    public static void ejercicio2(){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Ingrese el primer numero entero: ");
    int num1 = scanner.nextInt();
    System.out.print("Ingrese el segundo numero entero: ");
    int num2 = scanner.nextInt();
    System.out.print("Ingrese el tercer numero entero: ");
    int num3 = scanner.nextInt();
    if ((num1>num2 && num1>num3)){
        System.out.println("El numero 1 es el mayor de los tres");
    } else if((num2>num1 && num2>num3)){
                System.out.println("El numero 2 es el mayor de los tres numeros ingresados");
        }   else{
                System.out.println("El numero 3 es el mayor");
                }}
    
    // Ejercicio 3

    public static void ejercicio3(){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();
    if ((edad<12)){
        System.out.println("Usted es un nino.");
    } else if((edad <= 17)){
                System.out.println("Usted es un adolescente.");
        } else if (edad<=59){
                System.out.println("Usted es un adulto.");
                }
        else {
            System.out.print("Usted es un adulto mayor");
        }}
    
    // Ejercicio 4
    public static void ejercicio4(){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Ingrese el precio del producto: ");
    double precio = scanner.nextDouble();
    System.out.print("Ingrese a que categoria de producto pertenece: A / B / C : ");
    String categoria = scanner.next().toUpperCase();
    double descuento = 0;
    
    if (categoria.equals("A")){
        descuento = 0.10;
    } else if(categoria.equals("B")){
        descuento = 0.15;
        } else if (categoria.equals("C")){
            descuento = 0.20;  
        }
   
    double precioFinal = precio - (precio * descuento);
    System.out.println("El descuento aplicado fue de: " +(descuento*100) + "%");
    System.out.println("El precio final del producto es: "+ precioFinal);
     }
   
    // Ejercicio 5
    public static void ejercicio5(){
    Scanner scanner = new Scanner (System.in);
    int num, suma=0;
    
    do {
        System.out.print("Ingrese un numero (0 para terminar): ");
        num = scanner.nextInt();
        if (num % 2 == 0 && num != 0) {
            suma += num;
        }
    } while (num != 0);
    System.out.println("La suma de los numeros pares es: " + suma);
    
     }
    
    // Ejercicio 6
    public static void ejercicio6(){
    Scanner scanner = new Scanner (System.in);
    int positivos = 0, negativos=0, ceros=0;
    
    for (int i=1; i <= 10; i++){
        System.out.print("Ingrese el numero " + i + ": ");
        int n = scanner.nextInt();
        if (n>0) positivos++;
        else if (n<0) negativos++;
        else ceros++;
    }
    System.out.println("Positivos: " + positivos);
    System.out.println("Negativos: " + negativos);
    System.out.println("Ceros: " + ceros);
    
    } 
     
   
      // Ejercicio 7
    public static void ejercicio7(){
    Scanner scanner = new Scanner (System.in);
    int nota;
    
    do {
        System.out.print("Ingrese una nota (0-10): ");
        nota = scanner.nextInt();
        if (nota <0 || nota > 10 ){
            System.out.println("Error: nota invalida. Ingrese una nota entre 0 y 10. ");}
    
    } while (nota < 0  || nota > 10);
    
    System.out.println("Nota guardada correctamente: " + nota);
    
    } 
    
   // Ejercicio 8
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        return precioBase + (precioBase * impuesto / 100)- (precioBase * descuento /100);
    }
    
    public static void ejercicio8(){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Ingrese el precio base: ");
    double base = scanner.nextDouble();
    System.out.print("Ingrese el impuesto (%): ");
    double imp = scanner.nextDouble();
    System.out.print("Ingrese el descuento (%): ");
    double desc = scanner.nextDouble();
    
    double resultado = calcularPrecioFinal(base, imp, desc);
    System.out.println("El precio final del producto es: " + resultado);
    } 
    
    // Ejercicio 9
    public static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")) return peso*5;
        else return peso *10;
    }
    
    public static double calcularTotalCompra(double precio, double envio){
        return precio + envio ;
    }
    
    public static void ejercicio9(){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Ingrese el precio del producto: ");
    double precio = scanner.nextDouble();
    System.out.print("Ingrese el peso del paquete: ");
    double peso = scanner.nextDouble();
    System.out.print("Ingrese la zona (Nacional/Internacional): ");
    String zona = scanner.next();
    
    
    double  envio = calcularCostoEnvio(peso, zona);
    double total = calcularTotalCompra(precio,envio);
    
    System.out.println("El costo de envio es: " + envio);
    System.out.println("El total a pagar es: " + total);
    } 
    
    // Ejercicio 10
    public static int actualizarStock(int stock, int vendidos, int recibidos){
        return stock - vendidos + recibidos;
    }
    public static void ejercicio10(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el stock actual: ");
    int stock = scanner.nextInt();
    System.out.print("Ingrese cantidad vendida: ");
    int vendidos = scanner.nextInt();
    System.out.print("Ingrese cantidad recibida: ");
    int recibidos = scanner.nextInt();
    
    int nuevoStock = actualizarStock(stock, vendidos, recibidos);
    System.out.println("El nuevo stock es: " + nuevoStock);
    }
     
    // Ejercicio 11
    static double DESCUENTO_ESPECIAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void ejercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
    }
    
    // Ejercicio 12
    public static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        // modificar uno (ejemplo: el 3er elemento)
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }
    
    // Ejercicio 13: Recursividad
    public static void imprimirArrayRecursivo(double[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Precio: $" + arr[index]);
            imprimirArrayRecursivo(arr, index + 1);
        }
    }

    public static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }

    
    
    
    public static void main(String[] args) {
        //Descomentamos el ejercicio que querramos ejecutar:
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
    }    
}
