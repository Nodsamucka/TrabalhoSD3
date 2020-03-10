package Cliente;

public class Eleitor {

    private int cod;
    private String nome;
    private String cpf;
    private String numerotitulo;
    private boolean votou;
    public static boolean online;

    public Eleitor() {
    }

    public Eleitor(int cod, String nome, String cpf, String numerotitulo) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.votou = false;
        this.numerotitulo = numerotitulo;
    }

    public Eleitor(String nome, String cpf, String numerotitulo) {
        this.nome = nome;
        this.cpf = cpf;
        this.votou = false;
        this.numerotitulo = numerotitulo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isVotou() {
        return votou;
    }

    public void setVotou(boolean votou) {
        this.votou = votou;
    }

    public String getNumerotitulo() {
        return numerotitulo;
    }

    public void setNumerotitulo(String numerotitulo) {
        this.numerotitulo = numerotitulo;
    }

    @Override
    public String toString() {
        return "Eleitor{" + "cod=" + cod + ", nome=" + nome + ", cpf=" + cpf + ", numerotitulo=" + numerotitulo + ", votou=" + votou + '}';
    }
    
    
}
