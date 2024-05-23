package ApreWHILE.dESAFIO.Arraysss;

import java.util.Scanner;

public class facu {
    public static void main(String[] args) {
        double a,b,quon,poten = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a=entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        b=entrada.nextInt();
        quon=(int) (a/b);
        System.out.println("O quociente da divisão entre "+a+"/"+b+" = "+quon);
        poten=Math.pow(a,b);
        System.out.println(a+" elevado a "+b+" = "+poten);

    }
}
