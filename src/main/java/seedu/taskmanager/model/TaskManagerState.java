package seedu.taskmanager.model;

public class TaskManagerState {
    private TaskManager taskManager = new TaskManager();
    private String executedCommand;

    public TaskManagerState(ReadOnlyTaskManager taskManager, String executedCommand) {
        this.taskManager.resetData(taskManager);
        this.executedCommand = executedCommand;
    }

    public ReadOnlyTaskManager getTaskManager() {
        return taskManager;
    }

    public String getExecutedCommand() {
        return executedCommand;
    }
}
