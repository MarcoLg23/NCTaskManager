package mx.tc.j2se.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void TaskArray(){

        Task task1 = new TaskImpl();
        Task task2 = new TaskImpl();

        ArrayTaskList tasks = new ArrayTaskListImpl();
        assertEquals(0,tasks.size());
        tasks.add(task1);
        tasks.add(task2);
        assertEquals(2,tasks.size());

        assertTrue(tasks.remove(task1));
        assertEquals(1,tasks.size());
    }
}