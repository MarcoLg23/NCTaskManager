package mx.tc.j2se.tasks;

public class Main {
	public static void main(String[] args) {
		Task task = new TaskImpl();
		task.setTime(14);
		System.out.println(task.getTime());
	}
}
