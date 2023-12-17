package Application;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void addTask() {
		Task task = new Task("0001", "Integration Testing", "Test the whole Software Module");
		assertNotNull(task);
		assertEquals("0001", task.getTaskID());
		assertEquals("Integration Testing", task.getTaskName());
		assertEquals("Test the whole Software Module", task.getTaskDescription());
	}
	
	@Test
	void nullTaskID() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Integration Testing", "Test the whole Software Module");
		});
		assertTrue(exception.getMessage().contains("Invalid Entry"));
	}

}