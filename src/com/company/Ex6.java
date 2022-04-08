/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex6 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float counter = 0;

        for (int i = 0; i < 4; i++) {
            counter += inputValidator.unvalidatedFloat((i+1) + "º N: ");
        }

        System.out.println(counter / 4);
    }
}
