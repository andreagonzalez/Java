package aula04B;

public class Aula04B {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
        c1.status();

        Caneta c2 = new Caneta("LOL", "Rosa", 1.0f);
        c2.status();

//        
//         c1.setModelo("Bic"); //acessando o método acessor
//        //c1.modelo = "Bic"; //acesso direto ao atributo
//        
//        c1.setPonta(0.5f);
//        //c1.ponta = 0.5f; //não pode acessar direto, pois é private
//        
//       // c1.status();
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
//        
    }

}
