package inheritance_music_instruments;

public class Geige extends Instrument {
    public Geige(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Geige wird gestrichen");
        return lautstaerke;
    }
}
