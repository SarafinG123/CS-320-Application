package Application;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
	
	private final Map<String, Task> taskList = new HashMap<>();
	
	public void addTask(Task task) {
		if (task == null || taskList.containsKey(Task.getTaskID())) {
			throw new IllegalArgumentException("Task Already Exsists");
		}
		taskList.put(Task.getTaskID(), task);
	}
	
	public void deleteTask(String taskID) {
		taskList.remove(taskID);
	}
	
	public void updateTask(String taskID, String taskName, String taskDescription) {
		Task task = taskList.get(taskID);
		if (task == null) {
			throw new IllegalArgumentException("Task Not Found");
		}
		
		if (taskName != null) task.setTaskName(taskName);
		if (taskDescription != null) task.setTaskDescription(taskDescription);
	}
	

}