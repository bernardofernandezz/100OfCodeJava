// Parâmetros da função Java
package day08;

public class method {
    static void funcao(String fname, int age) {
        if (age > 0) {

            System.out.println(fname + " é maior de idade.");

            System.out.println(fname + " Doe" + " tem " + age + " anos.");

        }

    }

    public static void main(String[] args) {
        funcao("John", 21);
        funcao("Jenny", 37);

    }
}
