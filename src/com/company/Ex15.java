/*
 * Author: Matheus Ferreira da Costa
 * Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
 */
package com.company;

import com.company.util.InputValidator;

public class Ex15 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float ratio = inputValidator.validFloat("Cotação: ");

        float dolars = inputValidator.validFloat("Dólares: ");

        System.out.println(ratio * dolars);
    }
}
