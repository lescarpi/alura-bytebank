package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<Conta>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                contas.add(new ContaPoupanca(i*32+11, i*73+220));
            } else {
                contas.add(new ContaCorrente(i*32+11, i*73+220));
            }
        }

        System.out.println(contas.get(0).toString());
        System.out.println(new ContaPoupanca(11, 220).toString());

        System.out.println(contas.get(0).equals(new ContaPoupanca(11, 220)));
        System.out.println(contas.contains(new ContaPoupanca(11, 220)));

    }

}
