package ConceptsCode.Polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat sound");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Animal animalObject = new Dog();
        Animal animalObject2 = new Cat();

        animalObject.sound();
        animalObject2.sound();
    }
}
