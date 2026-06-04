package gr.aueb.cf.ch15.abstract_classes;

public abstract class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
