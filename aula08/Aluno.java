
/**
 * Classe que representa um aluno em sistema
 * academico. É uma subclasse de Pessoa.
 * 
 * @author Paulo Ewerton
 * @version 03/06/2022
 */
public class Aluno extends Pessoa
{
    private String matricula;
    private double[] notas = new double[3];
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String m) {
        matricula = m;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public void setNotas(double[] n) {
        notas = n;
    }
    
    public void adicionarNotas(double n1, double n2, double n3) {
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
    }
}
