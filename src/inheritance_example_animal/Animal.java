package inheritance_example_animal;

public class Animal {
    public Animal() {
        System.out.println("Animal constructor. ");
    }
    //Polymorphism using override
    public void action (){
        System.out.println("The animal eats.");
    }
}
