import java.util.Scanner;

public class imc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        double conta = peso/(altura*altura);
        System.out.printf("Altura = %.2f , seu peso é de %.2f , seu imc é de %.2f",altura,peso,conta);


        entrada.close();
    }
}
