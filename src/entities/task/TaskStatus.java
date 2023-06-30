package entities.task;

public class TaskStatus {
    private String descricao;

    public TaskStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}
