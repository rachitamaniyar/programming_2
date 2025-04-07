package StudentValidation;

import at.campus02.ini.zam.pr2.ue3.Main;

import java.util.Scanner;

public class StudentValidation {
    public static void main(String[] args) {
        final int MIN_AGE = 18;
        final int MAX_AGE = 99;
        final double MIN_GRADE = 1;
        final double MAX_GRADE = 2.5;
        Integer age = null;
        Double grade = null;
        System.out.println("How old are you? ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age < MIN_AGE || age > MAX_AGE) {
            System.out.println("Sorry, you cannot participate!");
        } else {
            System.out.println("What's your grade? ");
            grade = sc.nextDouble();
            if (grade < MIN_GRADE || grade > MAX_GRADE) {
                System.out.println("Sorry, you cannot participate!");
            } else {
                System.out.println("What is your field of study? ");
                String field = sc.next().toUpperCase();
                if (FieldofStudy.INFORMATICS.toString().equals(field)) {
                    System.out.println("Congrats, you're in!!");
                } else {
                    System.out.println("please try next time.");
                }
            }
            System.out.println(age+" "+grade);
        }
    }
}

