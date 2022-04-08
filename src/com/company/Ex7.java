/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex7 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float counter = 1;

        for (int i = 0; i < 2; i++) {
            counter *= inputValidator.unvalidatedFloat((i+1) + "º N: ");
        }

        System.out.println(Math.sqrt(counter));
    }
}
