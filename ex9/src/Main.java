import modelo.Tradutor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tradutor palavraUm = new Tradutor("Cachorro", "Dog");
        Tradutor palavraDois = new Tradutor("Cidade", "City");
        Tradutor palavraTres = new Tradutor("Feliz", "Feliz");
        Tradutor palavraQuatro = new Tradutor("Triste", "Sad");

        System.out.println("Digite 1 para traduzir uma palavra, digite 2 para inserir uma nova palavra e sua tradução:");
        int i = scanner.nextInt();

        if (i == 1){
            System.out.println("Digite a palavra que sera traduzida:");
            String palavra = scanner.nextLine();

        }else {
            System.out.println("Digite a palavra em português:");
            String palavraPT = scanner.nextLine();

            System.out.println("Digite a tradução dessa palavra em inglês:");
            String pavlavraIN = scanner.nextLine();
        }
    }
}

