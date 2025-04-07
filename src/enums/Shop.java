package enums;

public class Shop {
    private final String name;
    private final OpeningHours openingHours;

    public Shop(String name, OpeningHours openingHours) {
        this.name = name;
        this.openingHours = openingHours;
    }

    public String getName() {
        return name;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }
}
