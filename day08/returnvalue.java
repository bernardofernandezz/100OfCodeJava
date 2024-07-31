//Valores de retorno usando java ("Return")
package day08;

public class returnvalue {
    static int funcao(int x, int y) {
        return y + x;
    }

    public static void main(String[] args) {
        int z = funcao(20, 5);
        System.out.println(z);
    }
}

// Saida 25 (5 + 20)
