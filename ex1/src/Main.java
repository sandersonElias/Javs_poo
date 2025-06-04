import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horaInicial = 0;
        int minutosInicial = 0;
        int horaFinal = 0 ;
        int minutosFinal = 0 ;
        int i = 0;
        int validacao;

        System.out.println("Digite somente o valor da hora que você iniciou o jogo: ");
        horaInicial = entrada.nextInt();

        while (i != 1 ){
            if (horaInicial < 24 && horaInicial > (-1)){
                i = 1;
            }else{
                System.out.println("Hora inicial invalida.");

                System.out.println(" Novamente, digite somente o valor da hora que você iniciou o jogo: ");
                horaInicial = entrada.nextInt();
            }
        }

        System.out.println("Digite somente o valor do minutos que você iniciou o jogo: ");
        minutosInicial = entrada.nextInt();

        while (i != 2){
            if (minutosInicial < 61 && minutosInicial > (-1)){
                i = 2;
            }else {
                System.out.println("Minuto inicial invalido.");

                System.out.println("Novamente, digite somente o valor do minutos que você iniciou o jogo: ");
                minutosInicial = entrada.nextInt();
            }
        }

        System.out.println("Digite somete o valor da hora que você finalizou o jogo: ");
        horaFinal = entrada.nextInt();

        while (i != 3){
            if (horaFinal < 24 && horaFinal > (-1)){
                i = 3;
            }else{
                System.out.println("Horario final invalido.");

                System.out.println("Novamente, digite somete o valor da hora que você finalizou o jogo: ");
                horaFinal = entrada.nextInt();
            }
        }

        System.out.println("Digite somente o valor do minuto que você finalizou o jogo: ");
        minutosFinal = entrada.nextInt();

        while (i != 4){
            if (minutosFinal < 61 && minutosFinal > (-1)){
                i  = 4;
            }else {
                System.out.println("Minuto final invalido.");

                System.out.println("Novamente, digite somente o valor do minuto que você finalizou o jogo: ");
                minutosFinal = entrada.nextInt();
            }
        }

        System.out.println("Se você finalizou o jogo no mesmo dia, digite 1, caso contrario, você finalizou o jogo no dia seguine, digite 2.");
        validacao = entrada.nextInt();

        while ( i != 1){
            if (validacao == 1 || validacao == 2){
                i = 1;
            }else {
                System.out.println("Validação do dia incorreta.");

                System.out.println("Novamente, se você finalizou o jogo no mesmo dia, digite 1, caso contrario, você finalizou o jogo no dia seguine, digite 2.");
                validacao = entrada.nextInt();
            }
        }

        System.out.println("Horario de iniciu: " + horaInicial + ":" + minutosInicial);

        System.out.println("Horario de finalização: " + horaFinal + ":" + minutosFinal);

        int tempoDeJogo;
        int minutoInicio = ((horaInicial * 60) + minutosInicial);
        int minutoFinal =  ((horaFinal* 60) + minutosFinal);

        if (minutoFinal > minutoInicio){
            tempoDeJogo = minutoInicio - minutoFinal;
        }else{
            tempoDeJogo = (minutoFinal + 1440) - minutoInicio;
        }

        if (validacao == 2){
            tempoDeJogo = tempoDeJogo + 1440;
        }

        int tempoDeJogoHora = (tempoDeJogo / 60);
        if (tempoDeJogoHora < 0){
            tempoDeJogoHora = tempoDeJogoHora * (-1);
        }
        int tempoDeJogoMinuto = (tempoDeJogo % 60);
        if (tempoDeJogoMinuto < 0){
            tempoDeJogoMinuto = tempoDeJogoMinuto * (-1);
        }

        System.out.println("Tempo de jogo: " + tempoDeJogoHora + ":" + tempoDeJogoMinuto);

        if (tempoDeJogo < 1440 ){
            System.out.println("Você exedeu o tempo maximo permitido de execução do jogo.");
        }else {
            if (validacao == 1){
                System.out.println("Você inicializou e finalizou o jogo no mesmo dia.");
            }else{
                System.out.println("Você inicializou o jogo em um dia e finalizou no dia seguinte.");
            }
        }
    }
}