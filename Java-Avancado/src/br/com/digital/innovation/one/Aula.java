package br.com.digital.innovation.one;

public class Aula {
    public static void main(String[] args) {
        Funcao1 gerarUmaSaida = valor -> valor;
    }
@FunctionalInterface
    interface Funcao1{
        String gerar(String valor);

        }
    }

