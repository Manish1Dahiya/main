
package seedu.taskmanager.logic.commands;

import seedu.taskmanager.model.TaskManager;

/**
 * Clears the task manager.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Task manager has been cleared!";

    boolean mutatesData = true;

    @Override
    public CommandResult execute() {
        assert model != null;
        model.resetData(new TaskManager());
        return new CommandResult(MESSAGE_SUCCESS);
    }

    // @@author A0140417R
    @Override
    public boolean mutatesTaskManager() {
        return true;
    }
    // @@author
}
