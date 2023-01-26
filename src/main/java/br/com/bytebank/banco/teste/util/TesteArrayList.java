package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(4);
        lista.add(3);

        List<Integer> segundaLista = new ArrayList<Integer>(lista);
        for (Integer i : segundaLista) {
            System.out.println(i);
        }

    }

}
