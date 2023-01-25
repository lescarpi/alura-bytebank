package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToString {

    public static void main(String[] args) {

        ContaCorrente cr = new ContaCorrente(133, 3467);
        ContaPoupanca cp = new ContaPoupanca(432, 9912);

        System.out.println(cr.toString());
        System.out.println(cp.toString());

    }

}
