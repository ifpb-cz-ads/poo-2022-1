

public abstract class Animal
{
    public void comer() {
        System.out.println("animal comendo");
    }
}

class Gato extends Animal {
    public void miar() {
        System.out.println("miau");
    }   
}

class Cachorro extends Animal {
    public void latir() {
        System.out.println("auau");
    }
}

