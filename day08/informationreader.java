package day08;

import java.util.Scanner;

class informationreader {
    public static void main(String[] args) {
        Scanner meuobjeto = new Scanner(System.in);

        System.out.println("Enter name, age and salary: ");

        // String input
        String nome = meuobjeto.nextLine();

        // Numerical input
        int idade = meuobjeto.nextInt();
        double salario = meuobjeto.nextDouble();

        // Output input by User

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }

}
