/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex14 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float radius = inputValidator.validFloat("Raio: ");

        float width = inputValidator.validFloat("Lado: ");

        while (width > radius * 2) {
            width = inputValidator.validFloat("Lado: ");
        }

        float sphereVolume = (float) ((4 * Math.PI * Math.pow(radius, 3)) / 3);

        float cubeVolume = (float) Math.pow(width, 3);

        System.out.println(sphereVolume - cubeVolume);
    }
}
