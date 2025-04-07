package constants;

import java.util.Scanner;

public class AgeCalculator {
    static final int DAYS_IN_A_YEAR= 365;
    static final int WEEKS_IN_A_YEAR=52;
    static final int MONTHS_IN_A_YEAR=12;
public static int ageInDays(int a){
    return DAYS_IN_A_YEAR*a;

}
public static int ageInWeeks(int b){
    return WEEKS_IN_A_YEAR*b;
}
    public static int ageInMonths(int c){
        return MONTHS_IN_A_YEAR*c;

    }
}
