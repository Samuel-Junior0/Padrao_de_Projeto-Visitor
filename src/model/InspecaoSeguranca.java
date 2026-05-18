package model;

import interfaces.VisitanteSetor;

public class InspecaoSeguranca implements VisitanteSetor {
    @Override
    public void visitarArmazem(Armazem armazem) {
        System.out.printf("[SEGURANÇA] Armazém | Responsável - %s: ", armazem.getResponsavel());
        if (armazem.isProdutosPerigosos() && armazem.getQuantidadeEquipamento() > 5) {
            System.out.println(
                    "[ALERTA] ALTO RISCO devido a presença de muitos esquipamentos pesados próximos aos produtos com elevada taxa de periculosidade! ");
        } else {
            System.out.println("Ambiente com status regular");
        }
    }

    @Override
    public void visitarAdministrativo(Administrativo administrativo) {
        System.out.print("[SEGURANÇA] Administração: ");
        if (administrativo.getComputadoresLiagdos() > administrativo.getQuantidadeTomadas()) {
            System.out.println("[AVISO] Risco de sobrecarga elétrica, cada tomada deve comportar apenas um computador!");
        }else {
            System.out.println("Status seguro, separação correta");
        }
    }

    @Override
    public void visitarFrota(Frota frota) {
        System.out.print("[SEGURANÇA] Frota: ");
        if (frota.getVeiculosSemManutencao() > 0) {
            System.out.printf(
                    "[AVISO] %d do total de %d veículos necessitam de manutenção e serão retidos até que a mesma ocorra\n",
                    frota.getVeiculosSemManutencao(), frota.getTotalVeiculos());
        } else{
            System.out.println("Status Seguro. Todos os veículos liberados para entregas");
        }
    }

    @Override
    public void visitarProducao(Producao producao) {
        System.out.print("[SEGURANÇA] Produção: ");
        if (producao.getNiveDeRisco().equalsIgnoreCase("Alto") && !producao.isTodosUsamEPI()) {
            System.out.println("[CRÍTICO] Setor de alto risco com colaboradores sem EPI!");
        } else {
            System.out.printf("Status Regular. Uso de EPIs em conformidade com o risco \"%s\".", producao.getNiveDeRisco());
        }
    }
}

