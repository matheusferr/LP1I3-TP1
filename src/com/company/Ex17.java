/*
 * Author: Matheus Ferreira da Costa
 * Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex17 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float x = inputValidator.validFloat("X: ");

        int y = inputValidator.validInt("Y: ");

        System.out.println(Math.pow(x, y));
    }
}
