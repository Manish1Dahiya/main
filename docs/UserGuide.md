# Task Manager - User Guide

By : `Team POTATO`  &nbsp;&nbsp;&nbsp;&nbsp; Since: `Mar 2017`  &nbsp;&nbsp;&nbsp;&nbsp; Licence: `MIT`

---

1. [Quick Start](#quick-start)
2. [Features](#features)
3. [FAQ](#faq)
4. [Command Summary](#command-summary)

## 1. Quick Start

0. Ensure you have Java version `1.8.0_60` or later installed in your Computer.<br>

   > Having any Java 8 version is not enough. <br>
   > This app will not work with earlier versions of Java 8.

1. Download the latest `pota-todo.jar` from the [releases](../../../releases) tab.
2. Copy the file to the folder you want to use as the home folder for your task manager.
3. Double-click the file to start the app. The GUI should appear in a few seconds.
   > <img src="images/newUi.png" width="600">

4. Type the command in the command box and press <kbd>Enter</kbd> to execute it. <br>
   e.g. typing **`help`** and pressing <kbd>Enter</kbd> will open the help window.
5. Some example commands you can try:
   * **`list`** : lists all tasks
   * **`add`**`meeting from 25 April 1pm to 25th April 3pm`
     creates an event named `meeting` to the task manager.
   * **`delete`**` 3` : deletes the 3rd task shown in the current list
   * **`exit`** : exits the app
6. Refer to the [Features](#features) section below for details of each command.<br>


## 2. Features

**Command Format**
>
> * Words in `UPPER_CASE` are the parameters.
> * Items in `<SHARP_BRACKETS>` are compulsory.
> * Items in `[SQUARE_BRACKETS]` are optional.
> * Items with `...` after them  can have multiple instances.

### 2.1. Viewing help : `help`

**Format:** `help`

> Help is shown if you enter an incorrect command e.g. `abcd` <br>

### 2.2. Creating a task: `add`

Add a task which can be an event, a deadline or a floating task. <br>
All newly added tasks will appear at the top of the task list. <br>

The date expression can be in standard language. <br>

**For example:** <br>

* Formal dates:          [02/28/1979] <br>
* Relaxed dates:         [oct 1st]<br>
* Relative dates:        [next week] <br>
* Dates not accepted:    [next wed 9pm]<br>

**Accepted Start Markers :** `'from', 's/'` <br>
**Accepted End Markers :** `'at', 'to', 'by', 'e/'` <br>
**Accepted Tag Markers :** `t/` <br>

**Note:** <br>
> * Time for a task will only be shown if it is specified in the command itself. Otherwise, time will not be shown. For example, 12pm, 1400, 2.30pm. <br>
> * The start date specified must also be before the end date. <br>
> * The tag should be one word long only i.e. there should be no spaces in a specific tag. For example, tags such as 'very urgent' will nto be accepted as the tag is not one word. However, there can be more than one tag. <br>
> * Once a tag is created, it can be changed but it cannot be removed from its task. <br>

**Event format:** <br>
`add <TASK_NAME> [<START_DATE_MARKER> <DATE_START_TIME>] [<END_DATE_MARKER> <DATE_END_TIME>] [t/ TAG_NAME]...`<br>

**Example:** <br>
> add meeting with Boss from 25th April 1pm to 25th April 5pm t/important t/urgent  <br> 

This will add an event named 'meeting with Boss' with start date and time as 25th April 1pm and end date and time as 25th April 5pm with two tags 'important' and 'urgent'. <br>
              
              
**Deadline format:** `add <TASK_NAME> [END_DATE_MARKER] [DATE_DUE_TIME] [t/ TAG_NAME]...`<br>

**Example:** <br>
> add report submission by next wed  <br>

This will add a deadline named 'report submission' with [DATE_DUE_TIME] as the following wednesday without time. <br>
               
               
**Floating task format:** `add <TASK_NAME> [t/ TAG_NAME]...` <br>

**Example:** <br>
> add confess to love <br>

This command will simply add a floating task named 'confess to love'. <br>

**Note:** <br>
> The command to add a task will not be accepted if it only specifies the start attributes in a task. To understand more, please refer to the FAQ section in the end. <br>
     

### 2.3. Listing tasks : `list`

Shows a list of tasks which can include all tasks, only events, only deadlines or only floating tasks. The tasks can also be further filtered given a specified date. Several examples are given below for further clarification. <br>

**Format:** `list  [done / undone / floating / event / deadline] [DATE]`  <br>

**Example:** <br>
> list <br>

This command will simply list all the tasks. <br>

> list event <br>

This command will list all the event tasks (with no restriction on the dates of the tasks). <br>

> list March 27 <br>

This command will display all the event and deadline type tasks which have either the start date or end date as 27th March. <br>

> list deadline Feb 28 <br>

This command will list the deadline tasks which have the deadline as 28th February. Refer to note above regarding the usage of dates. <br>

> list undone <br>

This command will simply display all the tasks that have been marked as undone.<br>


**Note:**
> * When listing tasks with an event type parameter and a date, only the event type tasks which have a start date or event date corresponding to the date in command will be displayed. <br>
> * When listing tasks with a deadline type parameter and a date, only the deadline type tasks which have a due date corresponding to the date in command will be displayed. <br>
> * When listing done or undone tasks, [DATE] paramter will not be accepted. Therefore, [done/undone] cannot work along with [DATE]. <br>


### 2.4. Updating a task : `edit`

Updates an existing task in the task manager. <br>
All newly updated tasks will appear at the top of the task list. <br>
In case the tags are editted, all the previous tags will be removed and will be replaced by the new specified tags. <br>

**Event format:** <br>
`edit <index> [TASK_NAME] [<START_MARKER> <DATE_START_TIME>] [<END_DATE_MARKER> <DATE_END_TIME>] [t/ TAG_NAME]` <br>

**Example:** <br>
> edit 3 edited_event from 7th May 12pm to 9th May 5pm <br>

This command will edit the task at index number 3 with a new name, new start date and time, new end date and time. At least one of the [PARAMETERS] must be executed. <br>
    
            
**Deadline format:** `edit <index> [TASK_NAME] [<END_DATE_MARKER> <DATE_END_TIME>] [t/ TAG_NAME]` <br>

**Example:** <br>
> edit 4 edited_deadline e/03/05/2017 8pm <br>

This command will edit the task at index number 4 with new name, new end date and time. At least one of the [PARAMETERS] must be executed. <br>
               
**Floating task format:** `edit <index> [NEW_TASK_NAME] [t/ TAG_NAME]` <br>

**Example:** <br>
> edit 5 edited_floating_task <br>

This command will simply edit the task at index number 5 with new name. <br>

### **Changing a task type** <br>
It is also possible to change a task type using the edit command. To remove a start type and end date, replace the date parameter with the command 'remove'. Editing a dealdine with an addtional start date will create an event with the new start date and the orginal due date as end date. Editing an event with start date and end date removed will result in the event to turn into a floating task.  <br>

**Format:**  <br>
`edit <index> [NEW_TASK_NAME] [<START_MARKER> <DATE_START_TIME/remove>] [<END_DATE_MARKER> <DATE_END_TIME/remove>] [t/ TAG_NAME]`<br>

**Example:** <br>
> edit 5 project evaluation s/25th April <br>

This command will update the task 'project evaluation' which was a deadline task with end date only and make it an event task with start date as '25th April' and the end date as the old deadline date itself. <br>

> edit 4 exercise regularly s/remove <br>

This command will edit the task 'exercise regularly' by removing the dates added previously with this task. Thus, making it a floating task from an event type task. <br>

**Note:**<br>
> * In order to remove the dates, we have to follow the format 's/remove' and/or 'e/remove'. Any other format will not work with 'remove'. <br>
> * If a task only has the start attributes (after the edit command), it will not be accepted by pota-todo. To understand more, please refer to the FAQ section in the end. <br>
> * The start date specified must be before the end date. <br>
> * The tag should be one word long only i.e. there should be no spaces in a specific tag. For example, tags such as 'very urgent' will nto be accepted as the tag is not one word. However, there can be more than one tag. <br>
> * Once a tag is created, it can be changed but it cannot be removed from its task. <br>

### 2.5. Searching for all tasks containing a name : `find`

Searches for the tasks containing the input name. An example has been given below for further clarification. <br>

**Format:** `find <NAME>` <br>

**Example:** <br>
> find event <br>

This command will simply return the tasks with the name 'event' in them. <br> 

**Note:**  <br>
> To find a task by date, use the `list` command. <br> <br>
     

> * The search is not case sensitive. e.g `meeting` will match `Meeting`
> * The order of the keywords does not matter. e.g. `team meeting` will match `meeting team`
> * Only full words will be matched e.g. `meeting` will not match `meetings`
> * Tasks matching at least one keyword will be returned (i.e. `OR` search).
    e.g. `Meeting` will match `Company Meeting`


### 2.6. Deleting a task : `delete`

Deletes a specified task.<br>

**Format:** `delete <INDEX>` <br>

**Example:** <br>
> delete 2   <br>

This command will simply delete the task at index number 2 shown on the current list. <br>

### 2.7. Marking tasks as done: `mark`

Marks a particular task as either done or not done by changing the colour (RED for undone, GREEN for done) displayed next to the task in the task manager. <br>

**Format:** `mark <INDEX> <done/undone>` <br>

**Example:** <br>
> mark 4 done <br>

This command will dislay a green colour next to the task at index number 4 indicating that the particular task has been done. <br>

**Note:** <br>
> * Marking done to a task which is already done will not be accepted. Same applies to a task marked as undone.
> * The string "done/undone" is not case-sensitive. <br>

**Example:** <br>
> mark 1 dOnE <br>

### 2.8. Undo a command : `undo`

Undo the previous command executed. There is no limit to the number of undo actions that the task manager can execute. <br>

**Note:** <br>
> The undo command can only undo {add,mark,edit,clear} commands. <br>

**Format:** `undo` <br>

**Example:** <br>
> add meeting with professor <br>
> undo <br>

The first command will add the floating task 'meeting with professor'. The second command will remove the floating task 'meeting with professor' from the task manager therefore 'undoing' the previous command. <br>

### 2.9. Redo a command : `redo`

Execute the command undone by the previous undo command. Redo will basically undo the previous 'undo' command. Redo can be executed as many times as the 'undo' command execute right before the start of 'redo' command. However, there is no limit to the number of redo actions that the task manager can execute since there is no limit to the number of undo actions.<br>

**Note:** <br>
> The redo command can only redo the undo of {add,mark,edit,clear} commands. <br>

**Format:** `redo` <br>

**Example:** <br>
> add meeting with professor <br>
> undo <br>
> redo <br>

The first command will add the floating task 'meeting with professor'. The second command will remove the floating task 'meeting with professor' from the task manager therefore 'undoing' the previous command. The third command will add the floating task 'meeting with professor' again therefore 'undoing' the previous undo command. <br>


### 2.10. Setting notification period : `set`

Changes the setting of the time period of notification. An expiring task within stipulated time period will have a clock icon shown on the top right.

**Format:** `set <TIME_PERIOD> ` <br>

**Example:** <br>
> set 1 week <br>

This command will display a clock icon on the top right of the tasks which are expiring in one week. The new settings will be applied on the next launch of pota-todo. <br>

**Note:** <br>
> There is no limit to the time period. It can be 3 days or 1 week or 4 months or 123 years. <br>
> The set command only accepts relative dates. <br>


### 2.11. Changing the Filepath : `filepath`

Changes the save file directory. <br>

**Format:** `filepath <FILE_DIRECTORY>` <br>

**Example:** <br>
> filepath potato.xml <br>

This command will change the save file directory to potato.

**Note:** <br>
> The file directory specified must end with ".xml". <br>


### 2.12. Exiting the program : `exit`

Exits the program.<br>

**Format:** `exit` <br>


### 2.13. Saving the data
Task manager data are saved in the hard disk automatically after any mutating command, {add,mark,edit,clear}, which changes the data.<br>
Therefore, there is no need to save manually. <br>


## 3. FAQ

**Q:** How do I transfer my data to another Computer?<br>
**A:** Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous task manager folder. <br>

**Q:** Why is it that I cannot create/edit a task with only a start date? <br>
**A:** This is due to how pota-todo deals with categorisation of task. <br>
> * Events: Start Date and End Date
> * Deadlines: End Date Only
> * Floating: No dates 

As there are no valid task types with only a start date attribute, it is not accepted. <br>

**Q:** Why is that after I edit a task, which falls within the notification period, the notification icon does not appear at the top right of that task. How can I overcome this? <br>
**A:** In order for the notification icon to appear on the top right of an edited task, the task manager has to be restarted i.e. close and open again.<br>

## 4. Command Summary

* **Create an event** : <br>
  `add <TASK_NAME> [<START_DATE_MARKER> <DATE_START_TIME>] [<END_DATE_MARKER> <DATE_END_TIME>] [t/ TAG_NAME]...` <br>
   e.g. add birthday party s/1/1/2088 1200 e/1/1/2088 1230
 
* **Create a deadline** : <br>
  `add <TASK_NAME> [END_DATE_MARKER] [DATE_DUE_TIME] [t/ TAG_NAME]...` <br>
   e.g. add homework e/1/1/2088 1200
  
* **Create a floating task** : <br>
   `add <TASK_NAME> [t/ TAG_NAME]...` <br>
    e.g. add stay_healthy 
  
* **Edit Event format** : <br>
   `edit <index> [TASK_NAME] [<START_MARKER> <DATE_START_TIME>] [<END_DATE_MARKER> <DATE_END_TIME>] [t/ TAG_NAME]` <br>
    e.g. edit 3 edited_event s/01/01/2088 1200 e/01/01/2088 1230
            
* **Edit Deadline format** : <br>
   `edit <index> [TASK_NAME] [<END_DATE_MARKER> <DATE_END_TIME>] [t/ TAG_NAME]` <br>
    e.g. edit 4 edited_deadline e/01/01/2088 1200
               
* **Edit Floating task format** : <br>
   `edit <index> [NEW_TASK_NAME] [t/ TAG_NAME] ` <br>
    e.g. edit 5 edited_floating_task

* **Changing a task type** : <br>
`edit <index> [NEW_TASK_NAME] [<START_MARKER> <DATE_START_TIME/remove>] [<END_DATE_MARKER> <DATE_END_TIME/remove>] [t/ TAG_NAME]`<br>
   e.g. edit 5 project evaluation s/remove
   
* **Delete** : <br>
   `delete <INDEX>` <br>
   e.g. delete 1

* **Search** : <br>
   `find <NAME> ` <br>
   e.g. find meeting, find NUS

* **List** : <br>
   `list  [done / undone / floating / event / deadline] [DATE]` <br>
    e.g. list

* **Help** : <br>
   `help` <br>
    e.g. help

* **Mark Tasks as Done/Undone** : <br>
   `mark <INDEX> <done/undone>` <br>
   e.g. mark 2 done, mark 5 undone

* **Undo a command** : <br>
   `undo` <br>
   e.g. undo

* **Redo a command** : <br>
   `redo` <br>
   e.g. redo

* **Setting notification period** : <br>
   `set <TIME_PERIOD>` <br>
   e.g. set 4 days
   
* **Changing the filepath** : <br>
   `filepath <FILE_DIRECTORY>` <br>
   e.g. filepath tomato.xml
   
* **Exit** : <br>
   `exit` <br>
   e.g. exit
