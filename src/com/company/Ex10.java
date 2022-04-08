/*
 * Author: Matheus Ferreira da Costa
 * Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex10 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float celcius = inputValidator.validFloat("Celcius: ");

        System.out.println((celcius * 9/5)  + 32);
    }
}
