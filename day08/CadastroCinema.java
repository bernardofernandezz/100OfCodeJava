// Função com If e Else

package day08;

import java.util.Scanner;

public class CadastroCinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome e idade");

        // String input
        String nome = scanner.nextLine();

        // Numerical input
        int age = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + age);

        if (age < 18) {
            System.out.println("Acesso negado - Você não tem idade suficiente!");

        } else if (age == 18) {
            System.out.println("Acesso liberado - Você Já tem 18 anos");
        } else {
            System.out.println("Acesso Liberado - Você tem idade suficiente!");
        }
    }

}
