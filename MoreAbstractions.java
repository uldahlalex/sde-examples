class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        a.eat();
        a.respire();
        a.grow();
        a.fetch();
    }
}

interface IAnimal {
    void makeSound();
    void eat();
}
interface ILivingBeing {
    void respire();
    default void grow() {
        System.out.println("gains");
    }
}

abstract class Animal implements IAnimal, ILivingBeing {
    public void makeSound() {
        System.out.println("hey");
    }
    public void eat() {
        System.out.println("Nom nom nom");
    }
    abstract void fetch();
    public void respire() {
        System.out.println("Now respiring");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
    @Override
    public void fetch() {
        System.out.println("Here's your newspaper");
    }
}
