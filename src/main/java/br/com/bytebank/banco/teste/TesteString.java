package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        String str = "Testando classe String";
        char t = str.charAt(0);
        System.out.println(t);
        System.out.println(str.replace('t', '%'));
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf('s'));
        System.out.println(str.substring(3, 10));
        System.out.println(str.isEmpty());
        System.out.println("    ".isBlank());
        System.out.println(str.contains("sse"));
        System.out.println(str.concat(" do Java"));

    }

}
