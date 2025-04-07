package gifts;

import java.time.LocalDate;
import java.util.ArrayList;

public class Organizer {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Gift> gifts = new ArrayList<>();

    Person me = new Person("Rachita", LocalDate.of(1996, 8, 21));
    Person inna = new Person("Inna", LocalDate.of(1987, 4, 1));
    Person clarissa = new Person("Clarissa", LocalDate.of(2000, 1, 11));
    Person donna = new Person("Donna", LocalDate.of(1996, 11, 11));
    people.add(me);
    people.add(inna);
    people.add(donna);
    people.add(clarissa);

    Gift gamingPC= new Gift(1500, "gaming PC", "for clarissa");
    Gift flowers= new Gift(35, "Lilies and Roses");
    Gift tickets= new Gift(2000, "flight tickets", "maybe for Tasmania");
    Gift book= new Gift(45, "Clean Code");
    Gift voucher= new Gift(100, "Arts and Craft");
    Gift kitchen= new Gift(250, "Cups and Saucers");
    gifts.add(gamingPC);
    gifts.add(flowers);
    gifts.add(tickets);
    gifts.add(book);
    gifts.add(voucher);
    gifts.add(kitchen);

    me.getGiftIdeas().add(kitchen);
    me.getGiftIdeas().add(flowers);
    me.getGiftIdeas().add(voucher);
    me.getAlreadyGifted().add(book);
    clarissa.getGiftIdeas().add(gamingPC);
    clarissa.getGiftIdeas().add(voucher);
    clarissa.getGiftIdeas().add(book);
    clarissa.getAlreadyGifted().add(flowers);
    donna.getAlreadyGifted().add(flowers);
    donna.getGiftIdeas().add(book);
    donna.getGiftIdeas().add(tickets);
    inna.getAlreadyGifted().add(book);
    inna.getGiftIdeas().add(voucher);
    inna.getGiftIdeas().add(tickets);
    inna.getAlreadyGifted().add(kitchen);

    OrganizingService service=new OrganizingService(gifts, people);
        ArrayList<Gift> giftsForInna = service.findGiftsFor(inna);
        for (Gift gift : giftsForInna){
            System.out.println(gift.getLabel());
        }
 ArrayList<Person> birthdaysBefore = service.birthdaysBefore(LocalDate.of(2025, 12, 24));
        for ( Person person : birthdaysBefore){
            System.out.println(person.getName());
        }
        ArrayList<Gift> giftsInPriceRange = service.findGiftsInPriceRange(5, 250);
        for ( Gift gift : giftsInPriceRange){
            System.out.println(gift.getLabel());
        }
        System.out.println(service.hasAlreadyGifted(inna, kitchen));
    }
}
