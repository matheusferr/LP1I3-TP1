/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex12 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float height = inputValidator.validFloat("Altura: ");

        float radius = inputValidator.validFloat("Raio: ");

        System.out.println(Math.PI * Math.pow(radius, 2) * height);
    }
}
