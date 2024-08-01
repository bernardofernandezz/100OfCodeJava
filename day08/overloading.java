//Sobrecarga de função Java
package day08;

public class overloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int meunumero1 = plusMethodInt(5, 10);
        double meunumero2 = plusMethodDouble(4.31, 10.26);
        System.out.println("int: " + meunumero1);
        System.out.println("double: " + meunumero2);
    }
}
