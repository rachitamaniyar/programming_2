package inheritance_music_instruments;

public class Instrument {
    protected int lautstaerke;

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public int play() {
        return lautstaerke;
    }
}
