package mx.tc.j2se.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    public void taskTest(){
        Task task = new TaskImpl("Correr a las 55",55);
        assertEquals("Correr a las 55", task.getTitle());
        assertEquals(55, task.getTime());
        assertEquals(-1, task.nextTimeAfter(55));
        task.setTime(5,25,5);
        assertTrue(task.isRepeated());
        assertEquals(5,task.getTime());
        assertTrue(task.isActive());
        assertEquals(2,task.nextTimeAfter(3));
        assertEquals(3,task.nextTimeAfter(22));
        task.setTime(15);
        assertEquals(-1,task.nextTimeAfter(15));
    }
    @Test
    public void repTaskTest(){
        Task reptask = new TaskImpl("Correr diario a las 7",7,129,24);
        assertEquals("Correr diario a las 7",reptask.getTitle());
        assertEquals(7, reptask.getStartTime());
        assertEquals(129, reptask.getEndTime());
        assertEquals(24, reptask.getRepeatInterval());
        assertEquals(2, reptask.nextTimeAfter(77));
        reptask.setTime(5);
        assertFalse(reptask.isRepeated());
        assertTrue(reptask.isActive());
    }
}
