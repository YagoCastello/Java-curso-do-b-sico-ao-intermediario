import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o termo 'a' da conta  de bhaskara: ");
        double a = entrada.nextDouble();
        System.out.println("Digite o termo 'b' da conta  de bhaskara: ");
        double b = entrada.nextDouble();
        System.out.println("Digite o termo 'c' da conta  de bhaskara: ");
        double c = entrada.nextDouble();


        double delta = Math.pow(b,2) -4*a*c;
        double x1 = (-b+Math.pow(delta,(1/(double)2)))/((double)2*a);
        double x2 = (-b-Math.pow(delta,(1/(double)2)))/((double)2*a);


        System.out.printf("a = %.2f, b = %.2f, c = %.2f, delta = %.2f x' = %.2f, x'' = %.2f ",a,b,c,delta,x1,x2);
        entrada.close();
    }
}
