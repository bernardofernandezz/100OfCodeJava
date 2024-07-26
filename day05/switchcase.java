package day05;

public class switchcase {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Segunda-feira");
                break;

            case 7
            :
                System.out.println("Terça-feira");
                break;

            case 3:
                System.out.println("Quarta-feira");
                break;

            case 4:
                System.out.println("Quinta-feira");
                break;

            case 5:
                System.out.println("Sexta-feira");
                break;

            default:
                System.out.println("Pelo visto não encontramos ele aqui.");
        }
    }
}
