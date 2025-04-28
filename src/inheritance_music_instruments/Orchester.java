package inheritance_music_instruments;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> instrumente = new ArrayList<>();

    public void addInstrument(Instrument inst) {
        instrumente.add(inst);
    }

    public int playAll() {
        int summe = 0;
        for (Instrument inst : instrumente) {
            summe += inst.play();
        }
        return summe;
    }
}
