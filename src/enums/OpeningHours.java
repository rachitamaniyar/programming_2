package enums;

import java.time.DayOfWeek;

public class OpeningHours {
    private final boolean debug = true;
    private final String OPENINGTIME;
    private final String CLOSINGTIME;
    private final OpeningVariations OPENINGVARIATIONS;

    public OpeningHours(String OPENINGTIME, String CLOSINGTIME, OpeningVariations OPENINGVARIATIONS) {
        this.OPENINGTIME = OPENINGTIME;
        this.CLOSINGTIME = CLOSINGTIME;
        this.OPENINGVARIATIONS = OPENINGVARIATIONS;
        System.out.println("Object OpeningHours created");
    }
    public String getOpeningHoursToday(DayOfWeek dayOfWeek){
        if (debug) {
            System.out.println("OPENING TIME: " + OPENINGTIME+" "+CLOSINGTIME+" "+OPENINGVARIATIONS+" "+dayOfWeek);
        }
        if (dayOfWeek==DayOfWeek.SATURDAY||dayOfWeek==DayOfWeek.SUNDAY){
            return "Nicht geöffnet am sa/so.";
                   }
        if (dayOfWeek==DayOfWeek.MONDAY&&OPENINGVARIATIONS==OpeningVariations.TUETOFRI){
            return "Not open (DayOfWeek: monday OpeningVariation: TUETOFRI";
        }
        return "Shop is open today between: "+OPENINGTIME+" "+CLOSINGTIME; //System.getProperty("line.separator");
    }
}
