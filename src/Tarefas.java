import java.util.List;

public class Tarefas {
    private List<Tarefa> tarefas;

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    public void adicionaTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }


}
