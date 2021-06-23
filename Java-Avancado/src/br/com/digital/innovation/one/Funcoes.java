package br.com.digital.innovation.one;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string);
        System.out.println(retornarNomeAoContrario.apply("Joao"));
        System.out.print(converterStringParaInteiro.apply("20"));

    }
}
