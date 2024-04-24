import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        double celsius = entrada.nextDouble();

        double fa= (celsius*(9/(double)5)+32);

        System.out.printf("%.2f ªC equivale a %.2f ªF",celsius,fa);
       entrada.close();
    }
}
