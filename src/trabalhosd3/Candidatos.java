package trabalhosd3;

import Servidor.Votacao;

public class Candidatos {

    private int numeroeleicao;
    private String nome;

    public Candidatos(int numeroeleicao, String nome) {
        this.numeroeleicao = numeroeleicao;
        this.nome = nome;
    }

    public Candidatos() {
    }

    public Candidatos(int numeroeleicao) {
        this.numeroeleicao = numeroeleicao;
    }

    public Candidatos(String nome) {
        this.nome = nome;
    }

    public int getNumeroeleicao() {
        return numeroeleicao;
    }

    public void setNumeroeleicao(int numeroeleicao) {
        this.numeroeleicao = numeroeleicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Candidatos{" + "numeroeleicao=" + numeroeleicao + ", nome=" + nome + '}';
    }

    public String toString2() {
        StringBuilder builder =new StringBuilder();
        builder.append("      Nome:"+nome+"      Numero:"+numeroeleicao);
        return builder.toString();               
    }

}
