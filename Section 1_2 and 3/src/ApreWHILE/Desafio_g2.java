package ApreWHILE;

import java.util.Scanner;

public class Desafio_g2 {
    public static void main(String[] args) {
        double maior=0;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite o número de vezes:");
        double base = entrada.nextInt();
        for (int i = 0; i < base; i++) {

            System.out.println("Digite o "+(i+1)+"ª valor de A: ");
            double valor1 = entrada.nextDouble();
            System.out.println("Digite o "+(i+1)+"ª valor de B: ");
            double valor2 = entrada.nextDouble();
            if (valor1>valor2){
                System.out.println("O maior valor é o "+ valor1);
            }else {
                System.out.println("O maior valor é o "+ valor2);
            }

        }

    }
}
