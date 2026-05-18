package model;

import interfaces.Setor;
import interfaces.VisitanteSetor;

public class Frota implements Setor {
    private int totalVeiculos;
    private int veiculosSemManutencao;
    private int veiculosSujos;

    public Frota(int totalVeiculos, int veiculosSemManutencao, int veiculosSujos) {
        this.totalVeiculos = totalVeiculos;
        this.veiculosSemManutencao = veiculosSemManutencao;
        this.veiculosSujos = veiculosSujos;
    }

    public int getTotalVeiculos() {
        return totalVeiculos;
    }

    public int getVeiculosSemManutencao() {
        return veiculosSemManutencao;
    }

    public int getVeiculosSujos() {
        return veiculosSujos;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitarFrota(this);
    }
}
