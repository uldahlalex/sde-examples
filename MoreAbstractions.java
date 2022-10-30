class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        a.eat();
    }
}

interface IAnimal {
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
