/*
 * Author: Matheus Ferreira da Costa
 * Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex1 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float width = inputValidator.validFloat("Largura: ");

        float height = inputValidator.validFloat("Altura: ");

        System.out.println(width * height);
    }
}
