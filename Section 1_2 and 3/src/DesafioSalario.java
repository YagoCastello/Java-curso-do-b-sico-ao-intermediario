import java.util.Scanner;

public class DesafioSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        System.out.println("Digite o seu 1ª salário: ");
        String sal1 = entrada.next().replace(",",".");


        double salar1 = Double.parseDouble(sal1);


        System.out.println("Digite o seu 2ª salário: ");
        String sal2 = entrada.next().replace(",",".");


        double salar2 = Double.parseDouble(sal2);


        System.out.println("Digite o seu 1ª salário: ");
        String sal3 = entrada.next().replace(",",".");


        double salar3 = Double.parseDouble(sal3);


        System.out.println("Os salários foram de sal 1ª: R$ " + sal1+ ", sal 2ª: R$ "+ sal2+" e o sal 3ª: R$  "+ sal3);
        System.out.println("A média foi de R$: "+(salar3+salar1+salar2)/3);


        entrada.close();
    }
}
