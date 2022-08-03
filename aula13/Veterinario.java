
import java.util.*;

public class Veterinario
{
    public static void main(String[] args) {
        Veterinario vet = new Veterinario();
        List<Gato> animais = new ArrayList<>(List.of(
            new Gato(),
            new Gato(),
            new Gato()
        ));
        
        List<Gato> vacinados = vet.vacinarLista(animais);
        vacinados.get(0).miar();
    }
    
    public void vacinar(List<? extends Animal> animais) {
        for (Animal a : animais) {
            System.out.println("Animal " + animais.indexOf(a) + " vacinado");
        }
    }
    
    public <T extends Animal>List<T> vacinarLista(List<T> animais) {
        List<T> vacinados = new ArrayList<>();
        for (T a : animais) {
            System.out.println("Animal " + animais.indexOf(a) + " vacinado");
            vacinados.add(a);
        }
        
        return vacinados;
    }
}
