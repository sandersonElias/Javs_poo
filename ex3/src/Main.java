import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float celsiusTemperatura;
        float fahrenheitTemperatura;

        System.out.println("Digite o valor em graus Celsius:");
        celsiusTemperatura = entrada.nextInt();

        fahrenheitTemperatura = (celsiusTemperatura *9/5) + 32;

        System.out.println("A temperatura "+celsiusTemperatura+"°C é equivalente a "+fahrenheitTemperatura+ "°F.");

    }
}