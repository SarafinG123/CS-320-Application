package Application;

import java.time.LocalDateTime;

public class Appointment {
	private String appointmentID;
	private LocalDateTime appointmentDate;
	private String apptDescription;
	
	
    public Appointment(String appointmentID, LocalDateTime appointmentDate, String apptDescription) {
        if (appointmentID == null || appointmentID.length() > 10) {
            throw new IllegalArgumentException("Invalid Appointment ID");
        }
        if (appointmentDate == null || appointmentDate.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Invalid Date");
        }
        if (apptDescription == null || apptDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }

        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.apptDescription = apptDescription;
    }
		
	public String getAppointmentID() {
		return appointmentID;
	}
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
		
	}
	
	public String getApptDescription() {
		return apptDescription;
	}
	
	public void setAppointmentID(String appointmentID) {
		if (appointmentID != null && appointmentID.length() <= 10) {
			this.appointmentID = appointmentID;
		}
		else {
			throw new IllegalArgumentException ("Invalid Appointment ID");
		}
	}
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		if (appointmentDate != null && !appointmentDate.isBefore(LocalDateTime.now())) {
			this.appointmentDate = appointmentDate;
		}
		else {
			throw new IllegalArgumentException ("Invalid Date");
	}
	}
	public void setApptDescription(String apptDescription) {
		if (apptDescription != null && apptDescription.length() <= 50) {
			this.apptDescription = apptDescription;
		}
		else {
			throw new IllegalArgumentException ("Invalid Description");
		}
	}
	 
}
