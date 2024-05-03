package com.example.acitivi;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(int[] numeros) {
        int sumaTotal = 0;
        for (int numero : numeros) {
            sumaTotal += numero;
        }
        return sumaTotal;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int restar(int[] numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }

    // Método para multiplicar dos números enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Método para multiplicar tres números enteros
    public int multiplicar(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    // Método para multiplicar cuatro números enteros
    public int multiplicar(int num1, int num2, int num3, int num4) {
        return num1 * num2 * num3 * num4;
    }

    // Método para multiplicar una lista de números enteros
    public int multiplicar(int[] numeros) {
        int resultado = 1;
        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    // metodo para dividir entre dos numeros
    public double dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) num1 / num2;
    }
}
