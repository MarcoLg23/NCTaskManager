package mx.tc.j2se.tasks;

public class ArrayTaskListImpl implements ArrayTaskList{

    Task[] tasks = new Task[0];

    public ArrayTaskListImpl(){

    }

    /**
     * @param task task that is going to be added
     */
    @Override
    public void add(Task task) {

        Task[] tasks2 = new Task[tasks.length+1];
        int index = 0;
        for (Task i: tasks) {
            tasks2[index] = i;
            System.out.println(tasks2[index]);
            index++;
        }
        tasks2[tasks2.length-1] = task;
        tasks = tasks2;
    }

    /**
     * @param task task about to be removed
     * @return boolean existing task
     */
    @Override
    public boolean remove(Task task) {
        boolean exists = false;
        int count = 0, index = 0;
        for(Task i : tasks) {
            if (i == task) {
                exists = true;
                tasks[index] = null;
                count++;
            }
            index++;
        }
        Task[] tasks2 = new Task[tasks.length-count];
        index = 0;
        for (Task i : tasks) {
            if (i != null) {
                tasks2[index] = i;
                index++;
            }
        }
        tasks = tasks2;
        return exists;
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
        ArrayTaskList tasksInTime = new ArrayTaskListImpl();
        for (Task task : tasks)
            if (task.getTime() > from && task.getTime() < to) {
                tasksInTime.add(task);
                System.out.println(task.getTitle());
            }
        return tasksInTime;
    }
}
