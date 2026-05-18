package model;

import interfaces.Setor;
import interfaces.VisitanteSetor;

public class Producao implements Setor {
    private String niveDeRisco;
    private boolean todosUsamEPI;
    private String statusResiduosIndustriais;

    public Producao(String niveDeRisco, boolean todosUsamEPI, String statusResiduosIndustriais) {
        this.niveDeRisco = niveDeRisco;
        this.todosUsamEPI = todosUsamEPI;
        this.statusResiduosIndustriais = statusResiduosIndustriais;
    }

    public String getNiveDeRisco() {
        return niveDeRisco;
    }

    public boolean isTodosUsamEPI() {
        return todosUsamEPI;
    }

    public String getStatusResiduosIndustriais() {
        return statusResiduosIndustriais;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarProducao(this);
    }
}
