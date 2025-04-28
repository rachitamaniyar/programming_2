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
        Dog myDog = new Beagle();
        myDog.action();

        //Downcasting
        System.out.println("-----------------------------------");
        Beagle beagle1 = (Beagle) myDog;
        beagle1.action();

        Animal animal1 = (Animal) beagle1;
        animal1.action();
        beagle1= (Beagle) animal1;
        beagle1.action();
    }
}
