package ApreWHILE;

import java.util.Scanner;

public class DesaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            total += nota;
            quantidadeDeNotas++;

        }
        double media = total / quantidadeDeNotas;
        System.out.println("Média = "+media);
        entrada.close();
    }
}
