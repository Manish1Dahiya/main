
package seedu.taskmanager.model.task;

import seedu.taskmanager.model.tag.UniqueTagList;

/**
 * A read-only immutable interface for a Task in the taskmanager. Implementations should guarantee: details are present
 * and not null, field values are validated.
 */
public interface ReadOnlyTask {

    Name getName();

    TaskDate getStartDate();

    TaskDate getEndDate();

    boolean hasStartDate();

    boolean hasEndDate();

    boolean isDone();

    boolean isFloating();

    boolean isDeadline();

    boolean isEvent();

    /**
     * The returned TagList is a deep copy of the internal TagList, changes on the returned list will not affect the
     * task's internal tags.
     */
    UniqueTagList getTags();

    /**
     * Returns true if both have the same state. (interfaces cannot override .equals)
     */
    default boolean isSameStateAs(ReadOnlyTask other) {
        return other == this // short circuit if same object
                || (other != null // this is first to avoid NPE below
                        && other.getName().equals(this.getName()) // state
                                                                  // checks here
                                                                  // onwards
                );
    }

    /**
     * Formats the task as text, showing all contact details.
     */
    default String getAsText() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName());

        if (getStartDate() != null) {
            builder.append(" Start: ").append(getStartDate());
        }

        if (getEndDate() != null) {
            builder.append(" End: ").append(getEndDate());
        }

        builder.append(" Tags: ");
        getTags().forEach(builder::append);

        return builder.toString();
    }
}
