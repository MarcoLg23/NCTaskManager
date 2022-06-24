package mx.tc.j2se.tasks;

public class ArrayTaskListImpl implements ArrayTaskList{

    Task[] tasks = new Task[]{};

    public ArrayTaskListImpl(){
    }



    /**
     * @param task task that is going to be added
     */
    @Override
    public void add(Task task) {

        tasks[0] = task;
    }

    /**
     * @param task task about to be removed
     * @return boolean existing task
     */
    @Override
    public boolean remove(Task task) {
        for(Task i : tasks) {
            if (i == task)
                return true;
        }
        return false;
    }

    /**
     * @return the size of the array
     */
    @Override
    public int size() {
        return tasks.length;
    }

    /**
     * @param index the number of the task
     * @return the solicited task
     */
    @Override
    public Task getTask(int index) {
        return tasks[index];
    }

    /**
     * @param from arraylist incoming
     * @param to array outgoing
     * @return null
     */
    @Override
    public ArrayTaskList incoming(int from, int to) {
        return null;
    }
}
