package entityList;

import entities.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class TaskStatusList {
    private List<TaskStatus> status = new ArrayList<>();

    public List<TaskStatus> getStatus() {
        return status;
    }

    public void setStatus(List<TaskStatus> status) {
        this.status = status;
    }
}
