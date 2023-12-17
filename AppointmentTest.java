package Application;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Application.Appointment;

class AppointmentTest {

	private Appointment appointment;
    private LocalDateTime futureDate;

    @BeforeEach
    void setUp() {
        futureDate = LocalDateTime.now().plusDays(2);
    }

    @Test
    void createAppointment() {
        assertDoesNotThrow(() -> {
            new Appointment("0001", futureDate, "Appointment");
        });
    }

    @Test
    void invalidAppointmentID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, futureDate, "Appointment");
        });
        assertEquals("Invalid Appointment ID", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("085492398100", futureDate, "Appointment"); // ID too long
        });
        assertEquals("Invalid Appointment ID", exception.getMessage());
    }
    }
