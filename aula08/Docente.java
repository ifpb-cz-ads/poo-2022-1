
/**
 * Escreva uma descrição da classe Docente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Docente extends Servidor
{
    private String disciplina;
    
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String d) {
        disciplina = d;
    }
    
    public void darAula() {
        System.out.println("Professor " + getNome() + " em aula.");
    }
}
