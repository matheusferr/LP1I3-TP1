/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex2 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float width = inputValidator.validFloat("Lado: ");

        System.out.println(Math.pow(width, 2));
    }
}
