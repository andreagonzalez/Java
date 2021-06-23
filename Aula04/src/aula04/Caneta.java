package aula04;

public class Caneta {

    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    
    //Criando um método Construtor (mesmo nome da classe)
    public Caneta(String m, String c, float p){
       this.modelo = m; //está assim, pois não criei getters & setters
       this.cor = c; //está assim, pois não criei getters & setters
       this.setPonta(p);
        this.tampar();
               
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;

    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a Caneta: ");
       // System.out.println("Modelo: " + this.modelo); //desta forma ou como 
       //está na linha abaixo
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampada);
    }

}
