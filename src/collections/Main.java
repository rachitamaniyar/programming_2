package collections;

public class Main {
    public static void main(String[] args) {
//        Book book1 = new Book("Harry Potter","JK Rowling", "ISBN12345");
//    System.out.println(book1);
//    Box box = new Box();
//    box.putBook(book1);
//    box.printBooks();
    Fossils fossil = new Fossils("TRX100", "2000 BC", "TRex");
    FossilBox box = new FossilBox();
    box.putFossils(fossil);
    box.printFossilDetails();
    }
}
