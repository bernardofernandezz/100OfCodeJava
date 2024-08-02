package day09;
import java.util.Scanner;

public class welcome {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String name = sc.nextLine();
    System.out.println("Bem-vindo(a) " + name);
}

}
