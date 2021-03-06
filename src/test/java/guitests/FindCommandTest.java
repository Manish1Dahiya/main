
package guitests;

import static org.junit.Assert.assertTrue;

import seedu.taskmanager.testutil.TestTask;

public class FindCommandTest extends TaskManagerGuiTest {

    // @Test
    // public void find_nonEmptyList() {
    // assertFindResult("find moview"); // no results
    // assertFindResult("find Meeting", td.event1, td.event2); // multiple
    // // results
    //
    // // find after deleting one result
    // commandBox.runCommand("delete 1");
    // assertFindResult("find Meeting", td.event2);
    // }

    // @Test
    // public void find_emptyList() {
    // commandBox.runCommand("clear");
    // assertFindResult("find Jean"); // no results
    // }

    // @Test
    // public void find_invalidCommand_fail() {
    // commandBox.runCommand("findgeorge");
    // assertResultMessage(Messages.MESSAGE_UNKNOWN_COMMAND);
    // }

    private void assertFindResult(String command, TestTask... expectedHits) {
        commandBox.runCommand(command);
        assertListSize(expectedHits.length);
        assertResultMessage(expectedHits.length + " tasks listed!");
        assertTrue(taskListPanel.isListMatching(expectedHits));
    }
}
