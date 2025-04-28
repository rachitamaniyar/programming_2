package inheritance_music_instruments;

public class Gitarre extends Instrument {
    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Gitarre wird gezupft");
        return lautstaerke;
    }
}
