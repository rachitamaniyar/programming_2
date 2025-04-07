package hotel;

import java.util.HashMap;
import java.util.Scanner;

public class Guestbook {
    HashMap <Guest, String> guestbook = new HashMap<>();
    public void writeInGuestbook (Guest g){
//        for (Guest guest : guestbook.keySet()){
            Scanner input = new Scanner(System.in);
            System.out.println("give feedback: ");
           String entry=input.nextLine();
            guestbook.put(g, entry);
//        }
    }
    public void showGuestbook (){
        for (Guest key : guestbook.keySet()){
            String value = guestbook.get(key);
            System.out.println(key.getName()+" "+value);
        }
    }
}
