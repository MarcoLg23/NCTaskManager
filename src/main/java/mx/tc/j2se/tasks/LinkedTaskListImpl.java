package mx.tc.j2se.tasks;

public class LinkedTaskListImpl implements LinkedTaskList{

    Task[] tasks = new Task[0];

    public LinkedTaskListImpl(){

    }

    /**
     * @param task task to be added
     */
    @Override
    public void add(Task task){
        try {
            if (task != null) {
                Task[] tasks2 = new Task[tasks.length + 1];
                int index = 0;
                for (Task i : tasks) {
                    tasks2[index] = i;
                    System.out.println(tasks2[index]);
                    index++;
                }
                tasks2[tasks2.length - 1] = task;
                tasks = tasks2;
            } else
                throw new IllegalArgumentException();
        }   catch (IllegalArgumentException e){
            System.out.println("Task cannot be null!");
        }
    }

    /**
     * @param task
     * @return
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
     * @return size of tasks array
     */
    @Override
    public int size() {
        return tasks.length;
    }

    /**
     * @param index task number to be returned
     * @return task with the index number
     */
    @Override
    public Task getTask(int index) throws IndexOutOfBoundsException{
        try{
            return tasks[index];
        }   catch (IndexOutOfBoundsException e){
            System.out.println("Index outside of bounds!!!");
        }
        return null;
    }

    /**
     * @param from
     * @param to
     * @return
     */
    @Override
    public LinkedTaskList incoming(int from, int to) {
        LinkedTaskList tasksInTime = new LinkedTaskListImpl();
        for (Task task : tasks)
            if (task.getTime() > from && task.getTime() < to) {
                tasksInTime.add(task);
                System.out.println(task.getTitle());
            }
        return tasksInTime;
    }
}
