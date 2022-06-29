package mx.tc.j2se.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedTest {

    @Test
    public void TaskLinked(){

        Task task1 = new TaskImpl("Comer", -5);
        Task task2 = new TaskImpl("Dormir",2,122,24);
        Task task3 = new TaskImpl("Levantarse", 7);

        LinkedTaskList tasks = new LinkedTaskListImpl();
        assertEquals(0,tasks.size());
        tasks.add(task1);
        tasks.getTask(5);
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(null);
        assertEquals(4,tasks.size());
    }
}
