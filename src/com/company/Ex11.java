/*
 * Author: Matheus Ferreira da Costa
 * A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex11 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float diameter = inputValidator.validFloat("Diametro: ");

        System.out.println(Math.PI * Math.pow(diameter / 2, 2));
    }
}
