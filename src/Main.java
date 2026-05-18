import interfaces.Setor;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Setor> setoresEmpresa = new ArrayList<>();

        Armazem armazem = new Armazem("Fulano de Tal", 8, true, 7, false);
        Administrativo administrativo = new Administrativo(20, 15, true);
        Frota frota = new Frota(10, 5, 0);
        Producao producao = new Producao("Alto", false, "Limpo");

        setoresEmpresa.add(armazem);
        setoresEmpresa.add(administrativo);
        setoresEmpresa.add(frota);
        setoresEmpresa.add(producao);

        InspecaoSeguranca inspecaoSeguranca = new InspecaoSeguranca();
        AvaliacaoLimpeza avaliacaoLimpeza = new AvaliacaoLimpeza();

        System.out.println("=== INICIANDO INSPEÇÃO DE SEGURANÇA ===");
        for (Setor setor : setoresEmpresa) {
            setor.aceitar(inspecaoSeguranca);
        }

        System.out.println("\n----------------------------------------\n");

        System.out.println("=== INICIANDO AVALIAÇÃO DE LIMPEZA ===");
        for (Setor setor : setoresEmpresa) {
            setor.aceitar(avaliacaoLimpeza);
        }
    }
}
