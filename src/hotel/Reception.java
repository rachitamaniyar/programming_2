package hotel;

public class Reception {
    public static void main(String[] args) {
        Key keys1 = new Key(1, false);
        Key keys2 = new Key(2, true);
        Key keys3 = new Key(3, false);
        Key keys4 = new Key(4, true);
        Key key [] = new Key [4];
        key [0] = keys1;
        key [1] = keys2;
        key [2] = keys3;
        key [3] = keys4;
        KeyRack kr1 = new KeyRack(4, key);
        Guest g1 = new Guest("Rachita");
        Guest g2 = new Guest("Bunny");
        kr1.showKeyRack();
        System.out.println("--------------------------");
        kr1.giveKeyToGuest(g1, keys1);
        kr1.showKeyRack();
        System.out.println("--------------------------");
        System.out.println(g1.getName()+" "+g1.getKey().getRoomNumber()+" "+g1.getKey().isWithGuest());
        kr1.takeKeyBackFromGuest(g1);
        kr1.showKeyRack();
        System.out.println("--------------------------");
        kr1.giveKeyToGuest(g2, keys1);
        System.out.println(g2.getName()+" "+g2.getKey().getRoomNumber()+" "+g2.getKey().isWithGuest());
        kr1.showKeyRack();
        Guestbook gb1 = new Guestbook();
        gb1.writeInGuestbook(g1);
        gb1.showGuestbook();
    }
}
