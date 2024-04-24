import java.util.Scanner;

public class elevado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor :");
        double valor = entrada.nextDouble();

        System.out.printf("valor base = %.2f , valor ao quadrado = %.2f, valor ao cubo = %.2f",valor,(valor*valor),(valor*valor*valor));
    }
}
