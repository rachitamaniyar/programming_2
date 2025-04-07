package Maps;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
//        create
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate startOfStudy = LocalDate.of(2025, 3,3);
        System.out.println(startOfStudy);
//        parse String to date
        LocalDate parseDate = LocalDate.parse("1996-08-21");
        System.out.println(parseDate);
//access parts
        System.out.println(startOfStudy.getDayOfMonth());
        System.out.println(startOfStudy.atStartOfDay());
        System.out.println(startOfStudy.getYear());





    }
}
