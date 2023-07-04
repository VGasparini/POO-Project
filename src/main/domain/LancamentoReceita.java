package main.domain;

import main.domain.enums.TipoLancamento;

import java.time.LocalDate;

public class LancamentoReceita extends Lancamento {
    private TipoLancamento tipo;

    public LancamentoReceita(String descricao, Double valor, Integer day, Integer month, Integer year) {
        super(descricao, valor, day, month, year);
        this.tipo = TipoLancamento.RECEITA;
    }

    public LancamentoReceita(String descricao, Double valor, LocalDate vencimento) {
        super(descricao, valor, vencimento);
        this.tipo = TipoLancamento.RECEITA;
    }
}
