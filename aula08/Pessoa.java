
/**
 * Classe que representa pessoas em um sistema
 * academico.
 * 
 * @author Paulo Ewerton
 * @version 03/06/2022
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String t) {
        if (t.length() <= 10) {
            telefone = t;
        }
    }
}
