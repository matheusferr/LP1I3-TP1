/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex3 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float diagonal = inputValidator.validFloat("Diagonal: ");

        System.out.println(Math.pow(diagonal, 2) / 2);
    }
}
