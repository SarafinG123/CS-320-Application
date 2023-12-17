package Application;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	private AppointmentService service;
    private Appointment appointment;
    private LocalDateTime futureDate;

    @BeforeEach
    void setUp() {
        service = new AppointmentService();
        futureDate = LocalDateTime.now().plusDays(2);
        appointment = new Appointment("12345", futureDate, "Appointment");
    }

    @Test
    void addAndRemoveValidAppointment() {
        assertDoesNotThrow(() -> service.addAppointment(appointment));
        assertDoesNotThrow(() -> service.deleteAppointment("12345"));
    }

    @Test
    void throwExceptionForAddingNullAppointment() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(null);
        });
        assertEquals("Appointment Null", exception.getMessage());
    }

    @Test
    void throwExceptionForDuplicateAppointment() {
        service.addAppointment(appointment);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(appointment);
        });
        assertEquals("Duplicate Appointment", exception.getMessage());
    }
}
