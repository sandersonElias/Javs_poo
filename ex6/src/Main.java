import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        String nome = scanner.nextLine();

        System.out.println("Digite salario mensal desse funcionario:");
        double salarioMensal = scanner.nextDouble();

        System.out.println("Digite o total de meses trabalhados por esse funcionario:");
        int mesesTrabalhados = scanner.nextInt();

        double salarioAnual = salarioMensal * mesesTrabalhados;

        System.out.println("O funcionario:"+nome+" recebera anualmente: R$"+salarioAnual);
    }
}