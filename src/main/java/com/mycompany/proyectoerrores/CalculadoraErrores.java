/*
 * Metodos Numericos 
 * Ana Lila Ibarra Gamez 
 * 12 de septiembre del 2025
 */
package com.mycompany.proyectoerrores;

public class CalculadoraErrores {
    
    public double calcularErrorAbsoluto(double verdadero, double aproximado) {
        return Math.abs(verdadero - aproximado);
    }

    public double calcularErrorRelativo(double verdadero, double aproximado) {
        if (verdadero == 0) {
            throw new ArithmeticException("El valor verdadero no puede ser cero para calcular error relativo");
        }
        double errorAbsoluto = calcularErrorAbsoluto(verdadero, aproximado);
        return errorAbsoluto / Math.abs(verdadero);
    }
}
