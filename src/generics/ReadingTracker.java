package generics;
import java.util.ArrayList;

public class ReadingTracker {
    public static void main(String[] args) {
        ArrayList<Book> toBeRead = new ArrayList<>();
        ArrayList<Book> alreadyRead = new ArrayList<>();

        Book book1 = new Book("Homo Sapiens", "Yuval Noah Harari", "1");
        Book book2 = new Book("Atomic Habits", "James Clear", "2");
        Book book3 = new Book("Ikigai", "Hector Garcia", "3");
        Book book4 = new Book("Murakami", "Norwegian Wood", "4");

        alreadyRead.add(book1);
        alreadyRead.add(book2);
        toBeRead.add(book3);
        toBeRead.add(book4);

        showList(toBeRead);
        System.out.println("---------");
        showList(alreadyRead);

        reading(book3, toBeRead, alreadyRead);
        System.out.println("---------");

        showList(toBeRead);
        System.out.println("---------");
        showList(alreadyRead);

    }
    public static void showList(ArrayList<Book> list) {

        for (Book b : list) {
            System.out.println(b);
        }
    }
    public static void reading (Book item, ArrayList<Book> tbr, ArrayList<Book>ar){
        if (tbr.contains(item)){
            ar.add(item);
            tbr.remove(item);
        }

    }
}
