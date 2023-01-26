package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        Object[] contas = new Object[5];

        for (int i = 0; i < contas.length; i++) {
            if (i % 2 == 0) {
                contas[i] = new ContaPoupanca(i*32+11, i*73+220);
            } else {
                contas[i] = new ContaCorrente(i*32+11, i*73+220);
            }
            System.out.println(contas[i].toString());
        }

        ContaCorrente ref = (ContaCorrente) contas[1];

    }

}
