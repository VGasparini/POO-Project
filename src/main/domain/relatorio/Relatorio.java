package main.domain.relatorio;

import main.domain.lancamento.LancamentoBase;
import main.domain.lancamento.LancamentoDespesa;
import main.domain.lancamento.LancamentoReceita;

import java.util.List;

public class Relatorio {

    public Double GeraTotalDespesa(List<LancamentoBase> lista) {
        Double total = 0.0;
        for (LancamentoBase lancamento:
             lista) {
            if(lancamento instanceof LancamentoDespesa) {
                total += lancamento.getValor();
            }
        }
        return total;
    }

    public void RelatorioTotalDespesa(List<LancamentoBase> lista) {
        Double total = GeraTotalDespesa(lista);
        System.out.println("O total de despesas foi: " + total);
    }

    public Double GeraTotalReceita(List<LancamentoBase> lista) {
        Double total = 0.0;
        for (LancamentoBase lancamento:
             lista) {
            if(lancamento instanceof LancamentoReceita) {
                total += lancamento.getValor();
            }
        }
        return total;
    }

    public void RelatorioTotalReceita(List<LancamentoBase> lista) {
        Double total = GeraTotalReceita(lista);
        System.out.println("O total de receitas foi: " + total);
    }

    public Double GeraReceitasMenosDespesas(List<LancamentoBase> lista) {
        Double receitas = GeraTotalReceita(lista);
        Double despesas = GeraTotalDespesa(lista);
        return receitas-despesas;
    }

    public void RelatorioReceitasMenosDespesas(List<LancamentoBase> lista) {
        Double RMenosD = GeraReceitasMenosDespesas(lista);
        System.out.println("O valor de receita - despesa é: " + RMenosD);
    }
}
