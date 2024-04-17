public class OperarTernario {
    public static void main(String[] args) {
        double media = 8.6;

        String resultadoFinal = media >= 7.0 ?
                "aprovado." :" reprovado";
        System.out.println("O aluno está " + resultadoFinal);
    }
}
