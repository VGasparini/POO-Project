package entityList;

import entities.task.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tarefas = new ArrayList<>();

    public List<Task> getTarefas() { return tarefas; }

    public void setTarefas(List<Task> tarefas) { this.tarefas = tarefas; }
}
