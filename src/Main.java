import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double c;

        System.out.println("Digite o valor em Celsius para realizar as conversões: :");
        c = input.nextDouble();

        double f = c * 1.8 + 32;
        double k = c + 273.15;
        double re = c * 0.8;
        double ra = c * 1.8 + 32 + 459.67;

        String[] mensagens = {"o valor em de " + c + " graus celsius em Fahrenheit: " + f, "o valor em de " + c + " graus celsius em Kelvin: " + k
                             ,"o valor em de " + c + " graus celsius em Réaumur: " + re, "o valor em de " + c + " graus celsius em Rankine: " + ra};
        for (String mensagem : mensagens) {
            System.out.println(mensagem);

        }
        input.close();
    }
}

