/*
 * Author: Matheus Ferreira da Costa
 * Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
 */
package com.company;

import com.company.util.InputValidator;

public class Ex18 {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();

        float cartValue = 0;

        for (int i = 0; i < 5; i++) {
            cartValue += inputValidator.validFloat((i + 1) + "º Produto: ");
        }

        float payment = inputValidator.validInt("Pagamento: ");

        while (payment < cartValue) {
            payment = inputValidator.validInt("Pagamento: ");
        }

        System.out.println("Troco: R$ " + (
                payment == cartValue ? "0.00" : "" + (payment - cartValue)
        ));
    }
}
