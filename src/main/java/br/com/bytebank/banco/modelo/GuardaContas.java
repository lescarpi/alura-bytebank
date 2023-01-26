package br.com.bytebank.banco.modelo;

import java.util.ArrayList;
import java.util.List;

public class GuardaContas {

    private List<Conta> referencias = new ArrayList<Conta>();

    public GuardaContas() {
    }

    public void adiciona(Conta conta) {
        referencias.add(conta);
    }

    public List<Conta> getReferencias() {
        return this.referencias;
    }

}
