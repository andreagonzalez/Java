package projetolivro;

public interface Publicacao {
  public abstract void abrir();
  public abstract void fechar();
  public abstract void folhar(int p);
  public abstract void avancarPagina();
  public abstract void voltarPagina();
    
}