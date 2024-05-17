package ApreWHILE.dESAFIO.Arraysss;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        double soma=0;
        double media=0;
        Scanner entrada = new Scanner(System.in);

        double [] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a "+(i+1)+"ª nota: ");
            notas[i]= entrada.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            soma+=notas[i];

        }
        media=soma/ notas.length;
        System.out.println("Media é igual a "+ media);

        entrada.close();
    }
}
