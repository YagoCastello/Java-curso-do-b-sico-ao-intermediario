import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        double base = entrada.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double altura = entrada.nextDouble();

        double conta = (base*altura)/2;
        System.out.printf("Um triângulo de base %.2f e altura %.2f, possuí a uma area de %.2f",base,altura,conta);

        entrada.close();
    }
}
