package mx.tc.j2se.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void titleTest(){
        Task task = new TaskImpl();
        task.setTitle("Titulo");
        assertEquals("Titulo",task.getTitle());
    }
}
