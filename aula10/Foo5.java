
/**
 * Escreva uma descrição da classe Foo5 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Foo5
{
    static final int x = 12;

  public void go(final int x) {
    System.out.println(x);
  }
  
  public static void main(String[] args) {
      new Foo5().go(5);
      System.out.println(Foo5.x);
    }
}
