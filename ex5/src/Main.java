import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        int totalVotos = 0;
        int votosBranco = 0;
        int votosNulos = 0;
        int votosValidos = 0;
        int i = 0;

        while (i != 2){
            System.out.println("Para prefeito:\nJoão o Legal 32\nPedro banana 21");
            System.out.println("Para vereador:\nMario tupi 2344\nLucio 1555");

            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();

            if (idade < 16){
                System.out.println("Você não pode votar.");

            } else if (idade > 18 && idade < 70){
                System.out.println("Voto obrigatorio");

                System.out.println("Caso queira votar em branco, digite 1.");
                System.out.println("Digite o número para prefeito:");
                int paraPrefeiro = entrada.nextInt();

                System.out.println("Caso queira votar em branco, digite 1.");
                System.out.println("Digite o númro para vereador:");
                int paraVereador = entrada.nextInt();

                if (paraPrefeiro == 32 || paraPrefeiro == 21){
                    if (paraPrefeiro == 32){
                        System.out.println("Voto confirmado para prefeiro: João o Legal.");
                    }else{
                        System.out.println("Voto confirmado para prefeiro: Pedro banana.");
                    }
                    votosValidos = votosValidos + 1;

                }else if (paraPrefeiro == 1){
                    System.out.println("Voto confirmado para prefeiro: Em Branco.");
                    votosBranco = votosBranco + 1;

                }else {
                    System.out.println("Voto confirmado para prefeiro: Voto Nulo.");
                    votosNulos = votosNulos + 1;

                }

                if (paraVereador == 1555 || paraVereador == 2344){
                    if (paraVereador == 1555){
                        System.out.println("Voto confirmado para vereador: Lucio.");
                    }else {
                        System.out.println("Voto confirmado para vereador: Mario tupi. ");
                    }
                    votosValidos = votosValidos + 1;
                }else if (paraVereador == 1){
                    System.out.println("Voto confirmado para vereador: Em Branco.");
                    votosBranco = votosBranco + 1;

                }else {
                    System.out.println("Voto confirmado para vereador: Voto Nulo.");
                    votosNulos = votosNulos + 1;

                }

            }else{
                System.out.println("Você pode opitar por votar ou não votar, digite 1 caso queira votar, caso não queira votar digite 2,");
                int y = entrada.nextInt();

                if (y == 1) {
                    System.out.println("Caso queira votar em branco, digite 1.");
                    System.out.println("Digite o número para prefeito:");
                    int paraPrefeiro = entrada.nextInt();

                    System.out.println("Caso queira votar em branco, digite 1.");
                    System.out.println("Digite o númro para vereador:");
                    int paraVereador = entrada.nextInt();

                    if (paraPrefeiro == 32 || paraPrefeiro == 21) {
                        if (paraPrefeiro == 32) {
                            System.out.println("Voto confirmado para prefeiro: João o Legal.");
                        } else {
                            System.out.println("Voto confirmado para prefeiro: Pedro banana.");
                        }
                        votosValidos = votosValidos + 1;

                    } else if (paraPrefeiro == 1) {
                        System.out.println("Voto confirmado para prefeiro: Em Branco.");
                        votosBranco = votosBranco + 1;

                    } else {
                        System.out.println("Voto confirmado para prefeiro: Voto Nulo.");
                        votosNulos = votosNulos + 1;

                    }

                    if (paraVereador == 1555 || paraVereador == 2344) {
                        if (paraVereador == 1555) {
                            System.out.println("Voto confirmado para vereador: Lucio.");
                        } else {
                            System.out.println("Voto confirmado para vereador: Mario tupi. ");
                        }
                        votosValidos = votosValidos + 1;
                    } else if (paraVereador == 1) {
                        System.out.println("Voto confirmado para vereador: Em Branco.");
                        votosBranco = votosBranco + 1;

                    } else {
                        System.out.println("Voto confirmado para vereador: Voto Nulo.");
                        votosNulos = votosNulos + 1;

                    }
                }
            }
            totalVotos = votosBranco + votosNulos + votosNulos;
            System.out.println("Total de votos: " +totalVotos);;
            System.out.println("Número de votos validos:" +votosValidos)
            System.out.println("Número de votos em branco:"+votosBranco);
            System.out.println("Número de votos nulos:"+votosNulos);
            System.out.println("Registrado o seu voto, caso queira voltar novamente digite 1, para finalizar o programa digite 2. ");
            i = entrada.nextInt();
        }
    }
}