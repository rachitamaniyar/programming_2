package hotel;

public class KeyRack {
    private int numberOfRooms;
    private Key keys[];

    public KeyRack(int numberOfRooms, Key[] keys) {
        this.numberOfRooms = numberOfRooms;
        this.keys = keys;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key keys[]) {
        this.keys = keys;
    }

    public void giveKeyToGuest(Guest guest, Key room) {
        if (!room.isWithGuest()) {
            guest.setKey(room);
            guest.getKey().setWithGuest(true);
        }
        else {
            System.out.println("Find another key.");
        }
    }


    public void takeKeyBackFromGuest(Guest guest) {
        guest.getKey().setWithGuest(false);
        guest.setKey(null);
    }

    public void showKeyRack() {
        System.out.println("Room nr. - Availability");
        for (Key key : keys) {
            if (key.isWithGuest()) {
//                System.out.println("the following rooms are occupied: ");
                System.out.println(key.getRoomNumber() + " " + key.isWithGuest());
            } else {
//                System.out.println("the following rooms are free: ");
                System.out.println(key.getRoomNumber() + " " + key.isWithGuest());

            }
        }
    }
}

