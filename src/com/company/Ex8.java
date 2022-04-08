/*
 * Author: Matheus Ferreira da Costa
 * Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex8 {
   public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float ratio = 1852f / 1000;

        float miles = inputValidator.validFloat("Milhas: ");

        System.out.println(ratio * miles);
    }
}
