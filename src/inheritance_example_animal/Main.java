package inheritance_example_animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //Original method
        animal.action();
        System.out.println("-----------------------------------");
        Dog dog = new Dog();
        //Method modified for Dog
        dog.action();
        System.out.println("-----------------------------------");
        Beagle beagle = new Beagle();
        //Method modified for Beagle
        beagle.action();
        //Upcasting
        System.out.println("-----------------------------------");
        Dog beagle2 = new Beagle();
        beagle2.action();
    }
}
