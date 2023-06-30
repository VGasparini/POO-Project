package entities.task;

import java.time.LocalDate;

public class Task {
    private String titulo;
    private String descricao;
    private LocalDate dataCadastro;
    private LocalDate dataVencimento;
    private TaskStatus status;

    public Task(String titulo, String descricao, Integer day, Integer month, Integer year, LocalDate dataVencimento, TaskStatus status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCadastro = LocalDate.of(year,month,day);
        this.dataVencimento = dataVencimento;
        this.status = status;
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

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
