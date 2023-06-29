package main.java;

import java.util.List;

public class Checklist {
    private List<Task> tarefas;

    public List<Task> getTarefas() {
        return tarefas;
    }
    public void adicionaTarefa(Task tarefa) {
        this.tarefas.add(tarefa);
    }


}
