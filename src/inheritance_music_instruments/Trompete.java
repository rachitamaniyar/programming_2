package inheritance_music_instruments;

public class Trompete extends Instrument {
    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }
    @Override
    public int play() {
        System.out.println("Trompete wird geblasen");
        return lautstaerke;
    }
}
