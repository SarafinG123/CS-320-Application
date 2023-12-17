package Application;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
	private final Map<String, Appointment> appointmentList = new HashMap<>();
	
	public void addAppointment(Appointment appointment) {
		if (appointment == null) {
			throw new IllegalArgumentException("Appointment Null");
		}
		String appointmentID = appointment.getAppointmentID();
		if (appointmentList.containsKey(appointmentID)) {
			throw new IllegalArgumentException("Duplicate Appointment");
		}
		appointmentList.put(appointmentID, appointment);
	}
	
	public void deleteAppointment(String appointmentID) {
		if (appointmentID == null || !appointmentList.containsKey(appointmentID)) {
			throw new IllegalArgumentException("Appointment Not Found");
		}
		appointmentList.remove(appointmentID);
		}
		
	}
