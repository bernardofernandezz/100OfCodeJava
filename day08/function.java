// Função com If e Else

package day08;

public class function {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Acesso negado - Você não tem idade suficiente!");

        } else if (age == 18) {
            System.out.println("Acesso liberado - Você Já tem 18 anos");
        } else {
            System.out.println("Acesso Liberado - Você tem idade suficiente!");
        }
    }

    public static void main(String[] args) {
        checkAge(18);
    }

}
