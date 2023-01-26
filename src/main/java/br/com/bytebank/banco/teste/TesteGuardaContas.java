package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardaContas;

public class TesteGuardaContas {

    public static void main(String[] args) {

        GuardaContas guardaContas = new GuardaContas();

        for(int i = 0; i < 10; i++) {
            Conta conta = new ContaCorrente(i*(i+4)+12, i*i*(i*2)+53);
            guardaContas.adiciona(conta);
            System.out.println(guardaContas.getReferencias().get(i).toString());
        }

    }

}
