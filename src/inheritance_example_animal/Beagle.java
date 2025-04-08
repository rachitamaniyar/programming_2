package inheritance_example_animal;

public class Beagle extends Dog {
    public Beagle() {
        System.out.println("Beagle constructor.");
    }
    //Polymorphism using override
    @Override
    public void action() {
        System.out.println("The Beagle eats.");
    }
}
