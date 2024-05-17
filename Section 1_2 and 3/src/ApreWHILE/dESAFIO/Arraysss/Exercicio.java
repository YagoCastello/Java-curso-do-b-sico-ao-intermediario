package ApreWHILE.dESAFIO.Arraysss;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 2.6;
        notasAlunoA[2] = 4.5;
        notasAlunoA[3] = 8.5;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];

        }
        System.out.println(total/notasAlunoA.length);

        double [] notasAlunoB = {6.9, 8.9,5.3,10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];

        }

        System.out.println(total/notasAlunoB.length);

    }


}
