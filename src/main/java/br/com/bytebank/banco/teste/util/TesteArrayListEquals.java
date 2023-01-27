package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.*;

import java.util.*;
import java.util.function.Consumer;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<Conta>();

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                contas.add(new ContaPoupanca(11, i*31+220));
                contas.get(i).deposita(i*100+341);
            } else {
                contas.add(new ContaCorrente(11, i*73+241));
                contas.get(i).deposita(i*30+175);
            }
        }

        for (Conta conta : contas) {
            System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo());
        }

        Comparator<Conta> comparator = (c1, c2) -> {
                return Integer.compare(c1.getNumero(), c2.getNumero());
        };

        System.out.println("------------------- ORDENANDO PELO NÚMERO -------------------");
        contas.sort(comparator);

        contas.stream().forEach(conta -> System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo()));

        System.out.println("------------------- ORDEM NATURAL PELO SALDO -------------------");
        Collections.sort(contas);

        contas.forEach(conta -> System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo()));

        System.out.println("------------------- ORDEM REVERSA PELO SALDO -------------------");
        Collections.reverse(contas);

        contas.forEach(conta -> System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo()));

        System.out.println("------------------- ORDEM REVERSA PELO NÚMERO -------------------");
        contas.sort(Collections.reverseOrder(comparator));

        contas.forEach(conta -> System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo()));

        System.out.println("------------------- ROTACIONANDO -------------------");
        Collections.rotate(contas, 3);

        contas.forEach(conta -> System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo()));

        System.out.println("------------------- EMBARALHANDO -------------------");
        Collections.shuffle(contas);

        contas.forEach(conta -> System.out.println(conta.toString() + ", Saldo: " + conta.getSaldo()));

    }

}
