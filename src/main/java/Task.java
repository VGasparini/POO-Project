package main.java;

import main.java.type.TaskType;

import java.time.LocalDate;

public class Task {
    private String titulo;
    private String descricao;
    private LocalDate dataCadastro;
    private LocalDate dataVencimento;
    private TaskType status;

    public Task(String titulo, Integer day, Integer month, Integer year, String status) {
        this.titulo = titulo;
        this.dataCadastro = LocalDate.now();
        this.dataVencimento = LocalDate.of(year,month,day);
        this.status.setDescricao(status);
    }

    public Task(String titulo, String descricao, Integer day, Integer month, Integer year, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCadastro = LocalDate.now();
        this.dataVencimento = LocalDate.of(year,month,day);
        this.status.setDescricao(status);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

}
