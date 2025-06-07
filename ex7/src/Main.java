import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos na turma:");
        int numAlunos = scanner.nextInt();

        for (int i = 1; i <= numAlunos; i ++){
            System.out.println(i+"° aluno. Digite o nome do aluno:");
            String nome = scanner.next();

            System.out.println("Nota de primeira prova:");
            double n1 = scanner.nextDouble();

            System.out.println("Nota da segunda prova:");
            double n2 = scanner.nextDouble();

            System.out.println("Nota da terceira prova:");
            double n3 = scanner.nextDouble();

            double media = (n1 + n2 + n3) / 3;

            System.out.println("A media do aluno "+nome+" é:" +media);
        }
    }
}