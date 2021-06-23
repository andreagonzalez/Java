package aula013;

public class Cachorro extends Mamifero {
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if(frase.equals("toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
        
    }
    public void reagir (int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar o Rabo e Latir");
        }
        
    }
    public void reagir(boolean dono){
        if(dono == true){ //ou usar if(dono) dá na mesma
            System.out.println("Abanar o Rabo");
        }else{
            System.out.println("Grrrrrrr!!! Au!Au! Grrrr!!!");
        }
        
    }
    public void reagir (int idade, float peso){
        if (idade < 5) {
            if(peso < 5){
                System.out.println("Abanar o rabo");
                }else{
                System.out.println("Latir");
            }
            
        } else {
            if (peso < 10){
                System.out.println("Rosnar ");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
    
}
