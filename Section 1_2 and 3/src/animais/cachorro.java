package animais;

public class cachorro {


    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;


    public String getNome(){
        return this.nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public cachorro(){}
    public cachorro(String nome, String estadoDeEspirito, int tamanhoDoRabo, double peso, int altura, String cor) {
        this.nome = nome;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.peso = peso;
        this.altura = altura;
        this.cor = cor;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }



    public void setNome(String nome){

        this.nome = nome;
    }


    public void comer(){

    }
    public void latir(){
        System.out.println("Au au!");
    }
    public String pegar(){
        return "Bolinha";
    }
public String interagir(String acao){

        switch (acao) {
            case "carinho": this.estadoDeEspirito="feliz"; break;
            case "vai dormir!": this.estadoDeEspirito="Bravo"; break;
            case "pisou na patinha": this.estadoDeEspirito="Magoado"; break;
            default: this.estadoDeEspirito="Neutro"; break;
        }
        return estadoDeEspirito;

        }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
