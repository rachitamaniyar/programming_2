package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "John", "Smith");
        System.out.println(c1.toString());
        Addresse a1 = new Addresse("Smart Street", "1G0T Y0U", "Supercity", "AI");
        c1.addAddress(a1);
    }
}
