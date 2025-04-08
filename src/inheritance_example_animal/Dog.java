package inheritance_example_animal;

public class Dog extends Animal {
    public Dog() {
        //When calling something from the superclass constructor, that is not in the dog constructor use the method below
        //super();
        System.out.println("Dog constructor.");
    }
    //Polymorphism using override
    @Override
    public void action() {
        System.out.println("The dog eats.");
    }
}
