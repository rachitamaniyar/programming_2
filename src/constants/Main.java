package constants;

import java.util.Scanner;

import static at.campus02.ini.zam.pr2.ue1.constants.AgeCalculator.*;

public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age in years:");
        int age = input.nextInt();
        int days = ageInDays(age);
        System.out.println("age in days "+ days);
        System.out.println("age in weeks: "+ageInWeeks(age));
        System.out.println("age in months: "+ageInMonths(age));
    }
}
