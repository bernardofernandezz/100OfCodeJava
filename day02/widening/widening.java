package day02.widening;

public class widening {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);
    }

    public static void widening(String[] args) {
        double meuDouble = 9.78d;
        int meuInt = (int) meuDouble; // Manual casting: double to int

        System.out.println(meuDouble); // Outputs 9.78
        System.out.println(meuInt); // Outputs 9
    }

}
