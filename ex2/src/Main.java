import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;
        int restoDaDiv;

        int i = 0;
        while (i != 2){
            System.out.println("Digite um número inteiro:");
            num = entrada.nextInt();

            restoDaDiv = num % 2;

            switch (restoDaDiv){
                case 0:
                    System.out.println("O número " +num+ " é par.");
                    break;
                case 1:
                    System.out.println("O número " +num+ " é impar.");
                    break;
            }
            System.out.println("Caso queiraverificar outro número, digite 1, caso contrario, digite 2.");
            i = entrada.nextInt();
        }
    }
}