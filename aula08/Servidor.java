
/**
 * Classe que representa um(a) servidor(a) no
 * sistema academico. É subclasse de Pessoa.
 * 
 * @author Paulo Ewerton 
 * @version 03/06/2022
 */
public class Servidor extends Pessoa
{
    private String unidade;
    
    public String getUnidade() {
        return unidade;
    }
    
    public void setUnidade(String u) {
        unidade = u;
    }
}
