package main.domain.lancamento;

import main.utils.enums.lancamento.TipoLancamento;

import java.time.LocalDate;


public class LancamentoDespesa extends LancamentoBase {

    public LancamentoDespesa(String descricao, Double valor, Integer day, Integer month, Integer year) {
        super(descricao, valor, day, month, year, TipoLancamento.DESPESA);
    }

    public LancamentoDespesa(String descricao, Double valor, LocalDate vencimento) {
        super(descricao, valor, vencimento, TipoLancamento.DESPESA);
    }

}
