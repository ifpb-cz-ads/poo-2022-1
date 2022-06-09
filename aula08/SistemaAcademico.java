
/**
 * Define o programa principal do sistema
 * academico.
 * 
 * @author Paulo Ewerton
 * @version 03/06/2022
 */
public class SistemaAcademico
{
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Aluno 1");
        a1.setTelefone("838778889");
        a1.adicionarNotas(8.5, 7.2, 9.0);
        a1.setMatricula("2022338899");
        
        System.out.println("Dados do aluno: " + a1.getNome());
        System.out.println("Telefone: " + a1.getTelefone());
        System.out.println("Matricula: " + a1.getMatricula());
        
        //for (double nota : a1.getNotas()) {
        //    System.out.print("Nota: " + nota);
        //}
        
        double[] notas = a1.getNotas();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        
        Servidor[] servidores = new Servidor[3];
        servidores[0] = new Docente();
        servidores[1] = new Tecnico();
        servidores[2] = new Tecnico();
        
        //Docente d1 = new Docente();
        //d1.setDisciplina("Matematica");
        
        servidores[0].setNome("Docente 1");
        servidores[0].setTelefone("83887789");
        servidores[0].setUnidade("UNIND");
        
        System.out.println("Servidor " + servidores[0].getNome());
        System.out.println("Telefone " + servidores[0].getTelefone());
        System.out.println("Unidade " + servidores[0].getUnidade());
    }
    
}
