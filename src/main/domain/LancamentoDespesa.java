package main.domain;

import main.domain.enums.TipoLancamento;

import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class LancamentoDespesa extends Lancamento {
    private TipoLancamento tipo;

    public LancamentoDespesa(String descricao, Double valor, Integer day, Integer month, Integer year) {
        super(descricao, valor, day, month, year);
        this.tipo = TipoLancamento.DESPESA;
    }

}
