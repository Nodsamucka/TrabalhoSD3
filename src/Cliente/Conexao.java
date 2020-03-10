
package Cliente;

import java.util.ArrayList;
import java.util.List;

public class Conexao {
    private Eleitor eleitor;
    private String ip;
    private String porta;
    
   public static List<Conexao> listaconexao = new ArrayList<>();

    public Conexao() {
    }

    public Conexao(Eleitor eleitor, String ip, String porta) {
        this.eleitor = eleitor;
        this.ip = ip;
        this.porta = porta;
    }

    public Conexao(Eleitor eleitor, String ip) {
        this.eleitor = eleitor;
        this.ip = ip;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public void addConexao(Conexao c){
        listaconexao.add(c);
    }
    @Override
    public String toString() {
        return "Conexao{" + "eleitor=" + eleitor + ", ip=" + ip + ", porta=" + porta + '}';
    }
    
}
