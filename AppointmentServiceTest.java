package src;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

	public class AppointmentServiceTest {
	   public static List<Appointment> appointments = new ArrayList<>();
	   	AppointmentService appointmentService = new AppointmentService();
	   

	    @Test
	    public void addValidAppointment () {
	    	Appointment appointment = new Appointment("1", new Date(), "description");
	    	appointmentService.addAppointment(appointment);
	    	Appointment testAppointment = appointmentService.getAppointment("1");
	    	Assertions.assertEquals("description", testAppointment.getDescription());
	    }
	    @Test
	    public void deleteAppointmentMissingId() {
	    	AppointmentService appointmentService = new AppointmentService();
	    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
	    		appointmentService.deleteAppointment("10");
	    	});
	    }
	    
	    @Test
	    public void deleteAppointment() {
	    	Appointment appointment = new Appointment("1", new Date(), "description");
	    	appointmentService.addAppointment(appointment);
	    	appointmentService.deleteAppointment("1");
	    }
	}
