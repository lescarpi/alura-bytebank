package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteCsv {

    public static void main(String[] args) throws IOException {

        List<Conta> contas = new ArrayList<>();

        Scanner sc = new Scanner(new File("contas.csv"));

        while (sc.hasNextLine()) {

            String linha = sc.nextLine();

            Scanner scLinha = new Scanner(linha);
            scLinha.useLocale(Locale.US);
            scLinha.useDelimiter(",");

            String tipoConta = scLinha.next();
            int agencia = scLinha.nextInt();
            int numero = scLinha.nextInt();
            String nome = scLinha.next();
            double saldo = scLinha.nextDouble();

            Cliente titular = new Cliente();
            titular.setNome(nome);
            if (tipoConta.equalsIgnoreCase("CC")) {
                ContaCorrente cc = new ContaCorrente(agencia, numero);
                cc.setTitular(titular);
                cc.deposita(saldo);
                contas.add(cc);
            } else {
                ContaPoupanca cp = new ContaPoupanca(agencia, numero);
                cp.setTitular(titular);
                cp.deposita(saldo);
                contas.add(cp);
            }

            scLinha.close();

        }

        for (Conta c : contas) {
            System.out.format(Locale.US, "Contado do cliente %s é uma %s, com saldo R$%.2f %n", c.getTitular().getNome(), c.toString(), c.getSaldo());
        }

        sc.close();

    }

}
