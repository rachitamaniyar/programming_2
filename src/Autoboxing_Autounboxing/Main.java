package Autoboxing_Autounboxing;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        Integer wrappedInt = 1;
        System.out.println(wrappedInt);
        double d = 1d;
        System.out.println(d);
//        when lazy to add .0 for double just write d.
        Double wrappedDouble = 3d;
        System.out.println(wrappedDouble);
//        Autoboxing: needed in Generics and ..
        Integer wrappingInt = i;
        System.out.println(wrappingInt);
//        Autounboxing
        int unwrapped=wrappingInt;
        System.out.println(unwrapped);
    }
}
