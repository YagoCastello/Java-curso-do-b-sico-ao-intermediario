import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE O 1ª: ");
        int n1 = entrada.nextInt();
        System.out.println("DIGITE O 2ª: ");
        int n2 = entrada.nextInt();
        System.out.println("DIGITE O TERMO (+,-,*,/): ");
        String termo = entrada.next();
        boolean mais = termo.equals("+");





        System.out.print(mais ? n1 + " + "+ n2 + " = "+(n1+n2):" ");
        System.out.println(mais ? n1 + " + "+ n2 + " = "+(n1+n2):" ");
        System.out.println(mais ? n1 + " + "+ n2 + " = "+(n1+n2):" ");
        System.out.println(mais ? n1 + " + "+ n2 + " = "+(n1+n2):" ");

    }
}

