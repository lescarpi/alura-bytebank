package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteTempoLists {

    public static void main(String[] args) {

        // Testes com adição e remoção usando LinkedList
        long start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
            linkedList.add(i);
        }
        System.out.println("LinkedList demorou " + (System.currentTimeMillis() - start) + " millisegundos para adicionar e remover.");

        // Testes com adição e remoção usando ArrayList
        start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
            arrayList.add(i);
        }
        System.out.println("ArrayList demorou " + (System.currentTimeMillis() - start) + " millisegundos para adicionar e remover.");

        // Testes com iteração usando LinkedList
        start = System.currentTimeMillis();
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            linkedList1.add(i);
        }
        for (Integer i : linkedList1) {
            linkedList1.set(i, i+1);
        }
        System.out.println("LinkedList demorou " + (System.currentTimeMillis() - start) + " millisegundos para adicionar e iterar.");

        // Testes com iteração usando ArrayList
        start = System.currentTimeMillis();
        LinkedList<Integer> arrayList1 = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            arrayList1.add(i);
        }
        for (Integer i : arrayList1) {
            arrayList1.set(i, i+1);
        }
        System.out.println("ArrayList demorou " + (System.currentTimeMillis() - start) + " millisegundos para adicionar e iterar.");


    }

}
