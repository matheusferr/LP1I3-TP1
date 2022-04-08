/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex5 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float diameter = inputValidator.validFloat("Diametro: ");

        System.out.println(4 / 3f * Math.PI * Math.pow(diameter / 2, 3));
    }
}
