package Application;

public class Task {
	
	private String taskID;
	private String taskName;
	private String taskDescription;
	
	public Task(String taskID, String taskName, String taskDescription) {
		if (taskID == null || taskID.length() > 10 ||
				taskName == null || taskName.length() > 20 ||
				taskDescription == null || taskDescription.length() > 50) {
	            throw new IllegalArgumentException("Invalid Entry");
	}
		
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;

}

	public String getTaskID() { return taskID; } 
	public String getTaskName() { return taskName; }
	public String getTaskDescription() { return taskDescription; }
	
	public void setTaskName(String taskName) {
		if (taskName != null && taskName.length() <= 20) {
			this.taskName = taskName;
		} else {
			throw new IllegalArgumentException("Invalid Entry");
		}
		}
	
	public void setTaskDescription(String taskDescription) {
		if (taskDescription != null && taskDescription.length() <= 50) {
			this.taskDescription = taskDescription;
		} else {
			throw new IllegalArgumentException("Invalid Entry");
		}
	}
	}