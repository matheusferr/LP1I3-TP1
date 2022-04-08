/*
 * Author: Matheus Ferreira da Costa
 * Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex16 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float angle = inputValidator.validFloat("Ângulo: ");

        float rads = (float) (angle * Math.PI) / 180;

        System.out.println(Math.sin(rads));

        System.out.println(Math.cos(rads));

        System.out.println(Math.tan(rads));

        System.out.println(1 / Math.cos(rads));
    }
}
