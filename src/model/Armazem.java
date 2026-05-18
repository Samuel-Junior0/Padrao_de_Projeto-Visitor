package model;

import interfaces.Setor;
import interfaces.VisitanteSetor;

public class Armazem implements Setor {
    private String responsavel;
    private int quantidadeEquipamentoPesado;
    private boolean produtosPerigosos;
    private int caixasVaziasDescartadas;
    private boolean palletsHigienizados;

    public Armazem(String responsavel, int quantidadeEquipamentoPesado, boolean produtosPerigosos, int caixasVaziasDescartadas, boolean palletsHigienizados) {
        this.responsavel = responsavel;
        this.quantidadeEquipamentoPesado = quantidadeEquipamentoPesado;
        this.produtosPerigosos = produtosPerigosos;
        this.caixasVaziasDescartadas = caixasVaziasDescartadas;
        this.palletsHigienizados = palletsHigienizados;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getQuantidadeEquipamento() {
        return quantidadeEquipamentoPesado;
    }

    public boolean isProdutosPerigosos() {
        return produtosPerigosos;
    }

    public int getCaixasVaziasDescartadas() {
        return caixasVaziasDescartadas;
    }

    public boolean isPalletsHigienizados() {
        return palletsHigienizados;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarArmazem(this);
    }
}
