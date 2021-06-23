package br.com.digital.innovation.one;

public class FuncaoInterface {
    public static void main(String[] args) {
            Funcao colocarPrefixoSenhorNaString = new Funcao(){
                @Override
                public String gerar(String valor){
                    return "Sr. " + valor;
                }
            };
            System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
    @FunctionalInterface
    interface Funcao{
        String gerar(String valor);
    }
}
