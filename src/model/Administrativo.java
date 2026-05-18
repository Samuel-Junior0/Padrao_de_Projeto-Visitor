package model;

import interfaces.Setor;
import interfaces.VisitanteSetor;

public class Administrativo implements Setor {
    private int quantidadeTomadas;
    private int computadoresLiagdos;
    private boolean lixeirasDeReciclagemCheias;

    public Administrativo(int quantidadeTomadas, int computadoresLiagdos, boolean lixeirasDeReciclagemCheias) {
        this.quantidadeTomadas = quantidadeTomadas;
        this.computadoresLiagdos = computadoresLiagdos;
        this.lixeirasDeReciclagemCheias = lixeirasDeReciclagemCheias;
    }

    public int getQuantidadeTomadas() {
        return quantidadeTomadas;
    }

    public int getComputadoresLiagdos() {
        return computadoresLiagdos;
    }

    public boolean isLixeirasDeReciclagemCheias() {
        return lixeirasDeReciclagemCheias;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarAdministrativo(this);
    }
}
