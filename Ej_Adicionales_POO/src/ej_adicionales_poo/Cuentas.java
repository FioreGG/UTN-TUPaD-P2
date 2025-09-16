/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_adicionales_poo;


public class Cuentas {
    
   
    // Clase Cuentas - Caso practico 4
    static class Cuenta {
    // Atributos privados
        private int numero;
        private String titular;
        private double saldo;
        private static int ultimoNumero = 100;
        private static int totalCuentas = 0;
                
     // Constructor con titular (saldo=0)
        public Cuenta(String titular) {
            this.numero = ++ultimoNumero;
            this.titular = titular;
            this.saldo = 0;
            totalCuentas++;
        }     
    // Constructor con titular y saldo inicial
        public Cuenta(String titular, double saldoInicial) {
            this.numero = ++ultimoNumero;
            this.titular = titular;
            this.saldo = saldoInicial;
            totalCuentas++;
        }
        
        // Sobrecarga consultarSaldo
        public double consultarSaldo() {
            return saldo;
        }

        public double consultarSaldo(double cotizacionDolar) {
            if (cotizacionDolar <= 0) return 0;
            return saldo / cotizacionDolar;
        }

        // Depositar y extraer
        public void depositar(double monto) {
            if (monto > 0) {
                saldo += monto;
            }
        }

        public boolean extraer(double monto) {
            if (monto > 0 && monto <= saldo) {
                saldo -= monto;
                return true;
            }
            return false;
        }

        public static int mostrarTotalCuentas() {
            return totalCuentas;
        }

        @Override
        public String toString() {
            return "Cuenta [Numero=" + numero +
                   ", Titular=" + titular +
                   ", Saldo=" + String.format("%.2f", saldo) + "]";
        }
    }
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Maria");
        Cuenta c2 = new Cuenta("Jose", 2000);
        System.out.println(c1);
        System.out.println(c2);
        c1.depositar(500);
        c2.extraer(300);
        System.out.println("Despues de operaciones:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Saldo c2 en dolares (cotizacion 1360): " + c2.consultarSaldo(1360));
        System.out.println("Total cuentas creadas: " + Cuenta.mostrarTotalCuentas());
    }
    
}

