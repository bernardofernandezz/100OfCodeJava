package day08;

import java.util.Scanner;

class userentry {
    public static void main(String[] args) {
        Scanner meuobjeto = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName = meuobjeto.nextLine();
        System.out.println("Username is: " + userName);
    }
}
