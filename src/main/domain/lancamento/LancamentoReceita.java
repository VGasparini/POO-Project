package main.domain.lancamento;

import main.utils.enums.lancamento.TipoLancamento;

import java.time.LocalDate;

public class LancamentoReceita extends LancamentoBase {
    private TipoLancamento tipo = TipoLancamento.RECEITA;

    public LancamentoReceita(String descricao, Double valor, Integer day, Integer month, Integer year) {
        super(descricao, valor, day, month, year);
    }

    public LancamentoReceita(String descricao, Double valor, LocalDate vencimento) {
        super(descricao, valor, vencimento);
    }
}
