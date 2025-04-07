package Icebreaker;

import java.util.ArrayList;

public class Introduction {
    public static void main(String[] args) {
        ArrayList<Favourite> faves = new ArrayList<>();
        faves.add(new Favourite(Medium.VIDEOGAME, "Assassin's Creed", " Amazing game."));
        faves.add(new Favourite(Medium.BOOK, "Ikigai"));
      Person me = new Person("Rachita", "Maniyar", faves);
        System.out.println(me.introduceMe());
    }
}
