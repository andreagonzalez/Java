package aula012;

public class Peixe extends Animal{
    private String corEscamas;
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz barulho");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma bolha!");
    }

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
    
}
