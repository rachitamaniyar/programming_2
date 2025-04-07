package generics;


import collections.Fossils;

public class GenericMain {
    public static void main(String[] args) {
        Book book=new Book("title", "author", "isbn123");
        Fossils fossil =new Fossils("TRX100", "100 BC", "TRex");

        GenericBox<Book> BookBox= new GenericBox<>();

        BookBox.putItem(book);
        BookBox.printContents();

        GenericBox<Fossils> fossilBox = new GenericBox<>();

        fossilBox.putItem(fossil);
        fossilBox.printContents();

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.putItem(10);
        intBox.putItem(12);
        intBox.putItem(13);
        intBox.putItem(14);
        intBox.putItem(15);
        intBox.putItem(17);
        intBox.putItem(16);
        intBox.putItem(11);
        intBox.printContents();

        GenericPrinter<Book> bookPrinter = new GenericPrinter<>();
        bookPrinter.print(book);

    }
}
