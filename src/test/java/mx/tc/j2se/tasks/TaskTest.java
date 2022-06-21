package mx.tc.j2se.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void taskTest(){
        Task task = new TaskImpl("Correr a las 55",55);
        assertEquals("Correr a las 55", task.getTitle());
        assertEquals(55, task.getTime());
        System.out.println(task.getTitle()+" "+task.getTime());
        assertEquals(52, task.nextTimeAfter(3));
    }
    @Test
    public void repTaskTest(){
        Task reptask = new TaskImpl("Correr diario a las 7",7,127,24);
        assertEquals("Correr diario a las 7",reptask.getTitle());
        assertEquals(7, reptask.getStartTime());
        assertEquals(127, reptask.getEndTime());
        assertEquals(24, reptask.getRepeatInterval());
        assertEquals(2, reptask.nextTimeAfter(77));
        System.out.println(reptask.getTitle()+" "+reptask.getStartTime()+" "+reptask.getEndTime()+" "+reptask.getRepeatInterval()+" "+reptask.isActive());
    }
}
