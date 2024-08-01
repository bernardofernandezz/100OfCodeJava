package day02.price;

public class price {
    public static void main(String[] args) {
        // Criando variaveis para diferentes tipos de datas
        int items = 50;
        float valorPorItem = 9.99F;
        float valorFinal = items * valorPorItem;
        char real = 'R';
        char simbol = '$';

        // Preço das variaveis
        System.out.println("Numero de Itens: " + items);
        System.out.println("Valor por item: " + real + simbol + valorPorItem);
        System.out.println("Valor Total: " + real + simbol + valorFinal);
    }
}
