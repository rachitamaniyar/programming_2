package gifts;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String name;
    private LocalDate dob;
    private ArrayList<Gift> giftIdeas;
    private ArrayList<Gift> alreadyGifted;

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        this.giftIdeas = new ArrayList<>();
        this.alreadyGifted = new ArrayList<>();
    }
    public void addGift (Gift gift){
        this.giftIdeas.add(gift);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public ArrayList<Gift> getAlreadyGifted() {
        return alreadyGifted;
    }

    public void setAlreadyGifted(ArrayList<Gift> alreadyGifted) {
        this.alreadyGifted = alreadyGifted;
    }

    public ArrayList<Gift> getGiftIdeas() {
        return giftIdeas;
    }

    public void setGiftIdeas(ArrayList<Gift> giftIdeas) {
        this.giftIdeas = giftIdeas;
    }
}
