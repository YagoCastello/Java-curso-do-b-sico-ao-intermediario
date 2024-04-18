public class OperLogico {
    public static void main(String[] args) {
        //trabalho na terça (v ou f )
        //trabalho na quinta (v ou f )
        boolean trabalho1 = false;
        boolean trabalho2 = false;

      String mensagem = trabalho1 && trabalho2 ? "Vamos tomar sorvetes e comprar a tv de 50": " ";
      String mensagem2 = trabalho1 ^ trabalho2 ? " Vamos tomar sorvete e comprar a tv de 25": " ";
      String mensagem3 = trabalho1 && trabalho2 ? " ": " Sem sorvete";

      System.out.println(mensagem);
      System.out.println(mensagem2);
      System.out.println(mensagem3);
    }
}
