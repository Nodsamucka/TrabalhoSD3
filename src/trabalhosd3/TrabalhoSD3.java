package trabalhosd3;

import Cliente.Eleitor;
import Servidor.Votacao;

public class TrabalhoSD3 {

    public static void main(String[] args) {
        
        long init = System.currentTimeMillis();
        
        Votacao v = new Votacao();
        Candidatos c1 = new Candidatos(1, "A");
        Candidatos c2 = new Candidatos(2, "B");

        v.addCandidato(c1);
        v.addCandidato(c2);
        
        System.out.println(Votacao.listacandidatos);
        
        Eleitor e1 = new Eleitor(1,"Kael Pinheiro", "12371236163","123");
        Eleitor e2 = new Eleitor(2,"Samuca Mees", "32112345621","456");
        
       v.addEleitor(e1);
       v.addEleitor(e2);
       
        System.out.println(Votacao.listaeleitores);
        System.out.println(Votacao.listaeleitores);
        System.out.println(Votacao.listaeleitores);
        System.out.println(Votacao.listaeleitores);
        System.out.println(Votacao.listaeleitores);
        
        System.out.println(v.x1);
        
        long fim = System.currentTimeMillis();
        
        System.out.println("Tempo:"+(fim-init));
    }

}
