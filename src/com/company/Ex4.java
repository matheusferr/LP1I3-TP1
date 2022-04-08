/*
 * Author: Matheus Ferreira da Costa
 * A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex4 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float width = inputValidator.validFloat("Base: ");

        float height = inputValidator.validFloat("Altura: ");

        System.out.println((width * height) / 2);
    }
}
