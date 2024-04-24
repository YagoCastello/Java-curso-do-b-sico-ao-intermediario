import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fa = entrada.nextDouble();
        double celsius = (fa-32)*(5/(double)9);
        System.out.printf("%.2f ªF equivale a %.2f ªC",fa,celsius);
        entrada.close();


    }
}
