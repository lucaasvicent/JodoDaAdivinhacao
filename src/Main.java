import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.printf("Digite um número entre 0 e 100: ");
            int numDigitado = sc.nextInt();
            tentativas++;

            if (numDigitado == numGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + "tentativas!");
                break;
            } else if (numDigitado > numGerado) {
                System.out.println("O número que você digitou é MAIOR. Tente novamente!");
            } else {
                System.out.println("O número que você digitou é MENOR. Tente novamente!");
            }
        }
            if (tentativas == 5) {
                System.out.println("Que pena! Você não conseguiu acertar o número gerado... :( " + "O número a ser adivinhado era: " + numGerado);
            }
    }
}