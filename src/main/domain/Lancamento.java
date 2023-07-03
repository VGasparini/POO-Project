package main.domain;


import java.time.LocalDate;

public abstract class Lancamento {
    private String descricao;
    private Double valor;
    private LocalDate vencimento;

    public Lancamento(String descricao, Double valor, Integer day, Integer month, Integer year) {
        this.descricao = descricao;
        this.valor = valor;
        this.vencimento = LocalDate.of(year, month, day);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
