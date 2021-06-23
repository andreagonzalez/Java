package br.com.digital.innovation.one;

import com.sun.tools.javac.Main;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args){

    Consumer<String> imprimirUmaFrase = System.out::println;
    //Consumer<String> imprimirUmaFarse = frase -> System.out.println(frase);
    imprimirUmaFrase.accept("Hello World");

    }
}
