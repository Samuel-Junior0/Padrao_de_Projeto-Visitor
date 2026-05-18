package model;

import interfaces.VisitanteSetor;

public class AvaliacaoLimpeza implements VisitanteSetor {
    @Override
    public void visitarArmazem(Armazem armazem) {
        System.out.print("[LIMPEZA] Armazém: ");
        if (!armazem.isPalletsHigienizados() || armazem.getCaixasVaziasDescartadas() > 5) {
            System.out.printf("REPROVADO. Há %d caixas acumuladas e pallets sem higienização.\n", armazem.getCaixasVaziasDescartadas());
        } else {
            System.out.println("APROVADO. Organização dos pallets e descarte de caixas em dia.");
        }
    }

    @Override
    public void visitarAdministrativo(Administrativo administrativo) {
        System.out.print("[LIMPEZA] Administrativo: ");
        if (administrativo.isLixeirasDeReciclagemCheias()) {
            System.out.println("REPROVADO. Lixeiras de coleta seletiva estão lotadas. É necessário solicitar uma equipe de limpeza.");
        } else {
            System.out.println("APROVADO. Estações de trabalho limpas e lixeiras vazias.");
        }
    }

    @Override
    public void visitarFrota(Frota frota) {
        System.out.print("[LIMPEZA] Frota: ");
        if (frota.getVeiculosSujos() > 0) {
            System.out.println("REPROVADO. Detectados %d carros sujos no pátio.");
        } else {
            System.out.println("APROVADO. Pátio lavado e veículos limpos.");
        }
    }

    @Override
    public void visitarProducao(Producao producao) {
        System.out.print("[LIMPEZA] Produção: ");
        if (producao.getStatusResiduosIndustriais().equalsIgnoreCase("Crítico")) {
            System.out.println("REPROVADO. Acúmulo perigoso de resíduos industriais na linha de montagem.");
        } else if (producao.getStatusResiduosIndustriais().equalsIgnoreCase("Moderado")) {
            System.out.println("ATENÇÃO. Limpeza parcial realizada, agendar varrição industrial em breve.");
        } else {
            System.out.println("APROVADO. Chão de fábrica totalmente limpo.");
        }
    }
}
