/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex9 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float resistance = inputValidator.validFloat("Resistencia: ");

        float current = inputValidator.validFloat("Corrente: ");

        System.out.println(resistance * current);
    }
}
