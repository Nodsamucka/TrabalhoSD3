package Servidor;

import Cliente.Eleitor;
import java.util.ArrayList;
import java.util.List;
import trabalhosd3.Candidatos;

public class Votacao {

    public static List<Candidatos> listacandidatos = new ArrayList<>();
    public static List<Eleitor> listaeleitores = new ArrayList<>();

    public static List<Candidatos> listavotos = new ArrayList<>();
    public static int x1 = 0, x2 = 0;
    public static int x3=0;

    public void addCandidato(Candidatos c) {
        listacandidatos.add(c);
    }

    public void addEleitor(Eleitor e) {
        listaeleitores.add(e);
    }

    public void addVoto(Candidatos voto) {
        listavotos.add(voto);

    }

    public void contarVotos() {
        for (int i = 0; i < listavotos.size(); i++) {
            if (listavotos.get(i).getNumeroeleicao() == 1) {
                x1 = x1 + 1;
            } else if (listavotos.get(i).getNumeroeleicao() == 2) {
                x2 = x2 + 1;
            }
        }
    }
}
