
package guitests;

import seedu.taskmanager.testutil.TestTask;

// TODO: reduce GUI tests by transferring some tests to be covered by lower level tests.
public class EditCommandTest extends TaskManagerGuiTest {

    // The list of tasks in the task list panel is expected to match this list.
    // This list is updated with every successful call to assertEditSuccess().
    TestTask[] expectedTasksList = td.getTypicalTasks();

    // @Test
    // public void edit_allFieldsSpecified_success() throws Exception {
    // String detailsToEdit = "Bobby t/husband";
    //
    // int taskManagerIndex = 1;
    // TestTask editedTask = new TaskBuilder().withName("Bobby").withTags("husband").build();
    //
    // assertEditSuccess(taskManagerIndex, taskManagerIndex, detailsToEdit, editedTask);
    // }
    //
    // @Test
    // public void edit_notAllFieldsSpecified_success() throws Exception {
    // String detailsToEdit = "t/sweetie t/bestie";
    // int taskManagerIndex = 2;
    //
    // TestTask taskToEdit = expectedTasksList[taskManagerIndex - 1];
    // TestTask editedTask = new TaskBuilder(taskToEdit).withTags("sweetie", "bestie").build();
    //
    // assertEditSuccess(taskManagerIndex, taskManagerIndex, detailsToEdit, editedTask);
    // }
    //
    // @Test
    // public void edit_clearTags_success() throws Exception {
    // String detailsToEdit = "t/";
    // int taskManagerIndex = 2;
    //
    // TestTask taskToEdit = expectedTasksList[taskManagerIndex - 1];
    // TestTask editedTask = new TaskBuilder(taskToEdit).withTags().build();
    //
    // assertEditSuccess(taskManagerIndex, taskManagerIndex, detailsToEdit, editedTask);
    // }
    //
    // @Test
    // public void edit_findThenEdit_success() throws Exception {
    // commandBox.runCommand("find Elle");
    //
    // String detailsToEdit = "Belle";
    // int filteredTaskListIndex = 1;
    // int taskManagerIndex = 5;
    //
    // TestTask taskToEdit = expectedTasksList[taskManagerIndex - 1];
    // TestTask editedTask = new TaskBuilder(taskToEdit).withName("Belle").build();
    //
    // assertEditSuccess(filteredTaskListIndex, taskManagerIndex, detailsToEdit, editedTask);
    // }
    //
    // @Test
    // public void edit_missingTaskIndex_failure() {
    // commandBox.runCommand("edit Bobby");
    // assertResultMessage(String.format(MESSAGE_INVALID_COMMAND_FORMAT, EditCommand.MESSAGE_USAGE));
    // }
    //
    // @Test
    // public void edit_invalidTaskIndex_failure() {
    // commandBox.runCommand("edit 8 Bobby");
    // assertResultMessage(Messages.MESSAGE_INVALID_TASK_DISPLAYED_INDEX);
    // }
    //
    // @Test
    // public void edit_noFieldsSpecified_failure() {
    // commandBox.runCommand("edit 1");
    // assertResultMessage(EditCommand.MESSAGE_NOT_EDITED);
    // }
    //
    // @Test
    // public void edit_invalidValues_failure() {
    // commandBox.runCommand("edit 1 *&");
    // assertResultMessage(Name.MESSAGE_NAME_CONSTRAINTS);
    //
    // commandBox.runCommand("edit 1 t/*&");
    // assertResultMessage(Tag.MESSAGE_TAG_CONSTRAINTS);
    // }
    //
    // @Test
    // public void edit_duplicateTask_failure() {
    // commandBox.runCommand("edit 3 Alice Pauline t/friends");
    // assertResultMessage(EditCommand.MESSAGE_DUPLICATE_TASK);
    // }
    //
    // /**
    // * Checks whether the edited task has the correct updated details.
    // *
    // * @param filteredTaskListIndex
    // * index of task to edit in filtered list
    // * @param taskManagerIndex
    // * index of task to edit in the task manager. Must refer to the
    // * same task as {@code filteredTaskListIndex}
    // * @param detailsToEdit
    // * details to edit the task with as input to the edit command
    // * @param editedTask
    // * the expected task after editing the task's details
    // */
    // private void assertEditSuccess(int filteredTaskListIndex, int taskManagerIndex, String detailsToEdit,
    // TestTask editedTask) {
    // commandBox.runCommand("edit " + filteredTaskListIndex + " " + detailsToEdit);
    //
    // // confirm the new card contains the right data
    // TaskCardHandle editedCard = taskListPanel.navigateToTask(editedTask.getName().fullName);
    // assertMatching(editedTask, editedCard);
    //
    // // confirm the list now contains all previous tasks plus the task with
    // // updated details
    // expectedTasksList[taskManagerIndex - 1] = editedTask;
    // assertTrue(taskListPanel.isListMatching(expectedTasksList));
    // assertResultMessage(String.format(EditCommand.MESSAGE_SUCCESS, editedTask));
    // }
}
