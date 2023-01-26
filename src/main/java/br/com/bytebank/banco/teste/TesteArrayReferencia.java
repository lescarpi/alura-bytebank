package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        ContaCorrente[] contasCorrentes = new ContaCorrente[5];

        for (int i = 0; i < contasCorrentes.length; i++) {
            contasCorrentes[i] = new ContaCorrente(i*32+11, i*73+220);
            System.out.println(contasCorrentes[i].toString());
        }

    }

}
