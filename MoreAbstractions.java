class Main {
    public static void main(String[] args) {
        IAnimal a = new Dog();
        a.makeSound();
        a.eat();
        a.respire();
        a.grow();
    }
}

interface ILivingBeing {
    void respire();
    default void grow() {
        System.out.println("gains");
    }
}

interface IAnimal extends ILivingBeing {
    void makeSound();
    void eat();
}

abstract class Animal implements IAnimal {
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
