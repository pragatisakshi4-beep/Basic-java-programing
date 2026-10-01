abstract class Animal {

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void sound();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Bark");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + " says Meowwwwwww");
    }
}

public class CompletedOops {

    public static void main(String[] args) {

        Animal a1 = new Dog("Tommy");
        Animal a2 = new Cat("Kitty");

        a1.sound();
        a2.sound();
    }
}
