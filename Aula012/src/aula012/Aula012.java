package aula012;

public class Aula012 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        c.locomover();
        k.locomover();
        k.emitirSom();
        e.emitirSom();
        
        
        //mamífero
        m.setPeso(35.5f);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        //ave
        a.alimentar();
    }
    
    
}
