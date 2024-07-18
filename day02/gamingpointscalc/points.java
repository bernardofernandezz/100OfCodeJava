package day02.gamingpointscalc;

public class points {
    public static void main(String[] args) {
        // Maximo de pontos
        int maxScore = 500;

        int userScore = 423;

        /*
         * Calcula a porcentagem da pontuação do usuário em relação à pontuação máxima
         * disponível.
         * Converta userScore em float para garantir que a divisão seja precisa
         */

        float porcentagem = (float) userScore / maxScore * 100.0f;

        System.out.println("A porcentagem do usuario é: " + porcentagem);

    }

}
