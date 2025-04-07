package enums;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        System.out.println("uebung 2 start.");
OpeningHours openingHours=new OpeningHours("07:00", "23:00", OpeningVariations.MONTOFRI);
Shop myShop1= new Shop("Best shop in town", openingHours);
OpeningHours openingHoursMyShop= myShop1.getOpeningHours();
String isOpen= openingHoursMyShop.getOpeningHoursToday(DayOfWeek.TUESDAY);
        System.out.println("is open '"+isOpen+"'");
        System.out.println("2 uebung end.");
    }
}