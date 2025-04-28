package inheritance_music_instruments;

public class Main {
        public static void main(String[] args) {
            Orchester orchester = new Orchester();
            orchester.addInstrument(new Gitarre(5));
            orchester.addInstrument(new Trompete(7));
            orchester.addInstrument(new Geige(4));

            int gesamtLautstaerke = orchester.playAll();
            System.out.println("Gesamtlautstärke: " + gesamtLautstaerke);
        }
    }

