package main.domain.lancamento;


import java.time.LocalDate;

public abstract class LancamentoBase {
    private String descricao;
    private Double valor;
    private LocalDate vencimento;

    public LancamentoBase(String descricao, Double valor, Integer day, Integer month, Integer year) {
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = LocalDate.of(year, month, day);
    }

    public LancamentoBase(String descricao, Double valor, LocalDate vencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
