import modelo.Produtos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        System.out.println("Digite o nomedo novo produto:");
        String nome = scannner.nextLine();

        System.out.println("Digite a descrição desse produto:");
        String descricao = scannner.nextLine();

        System.out.println("Digite o preço desse produto:");
        float preco = scannner.nextFloat();

        System.out.println("Digite a quantidade de unidades desse produto no estoque:");
        int estoqueDisponivel = scannner.nextInt();

        Produtos produto = new Produtos(nome, descricao, preco, estoqueDisponivel);

    }
}