
/**
 * Escreva uma descrição da classe Animal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Animal
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public int x;

    /**
     * Construtor para objetos da classe Animal
     */
    public Animal(int x)
    {
        // inicializa variáveis de instância
        this.x = x;
    }
    
    private Animal() {}
    
    public static void main(String[] args) {
        Animal a = new Animal(10);
        System.out.println(a.x);
        Hipopotamo h = new Hipopotamo();
        h.x = 38;
    }
}
