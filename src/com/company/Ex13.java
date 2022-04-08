/*
 * Author: Matheus Ferreira da Costa
 * Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex13 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float initalSpeed = inputValidator.validFloat("V0: ");

        float accel = inputValidator.validFloat("Aceleração: ");

        int time = inputValidator.validInt("Tempo: ");

        float finalSpeed = initalSpeed + accel * time;

        System.out.println(finalSpeed * 3.6);
    }
}
