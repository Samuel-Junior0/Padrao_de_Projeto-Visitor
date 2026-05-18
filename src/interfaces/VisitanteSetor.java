package interfaces;

import model.Administrativo;
import model.Armazem;
import model.Frota;
import model.Producao;

public interface VisitanteSetor {
    void visitarArmazem(Armazem armazem);
    void visitarAdministrativo(Administrativo administrativo);
    void visitarFrota(Frota frota);
    void visitarProducao(Producao producao);
}
