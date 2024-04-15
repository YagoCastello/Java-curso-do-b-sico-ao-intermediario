package animais;

public class Main {
    public static void main(String[] args) {


        cachorro doguinho2 = new cachorro("floquinho","carinho",23,15.6,1,"preto");
        cachorro doguinho1 = new cachorro();
        doguinho1.setNome("docinho");
        doguinho1.setAltura(25);
        doguinho1.setCor("amarelo");
        doguinho1.setPeso(25);
        doguinho1.setTamanhoDoRabo(13);

        System.out.println(doguinho1);
        doguinho1.latir();
        System.out.println(doguinho1.pegar());
        System.out.println(doguinho1.interagir("carinho"));
        System.out.println(doguinho1.interagir("vai dormir!"));
        System.out.println(doguinho1.interagir("nada"));


        System.out.println(doguinho2.getNome());
        System.out.println(doguinho2.getPeso());
    }
}
