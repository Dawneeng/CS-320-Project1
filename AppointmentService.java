package src;
import java.util.HashMap;

public class AppointmentService {
	private HashMap<String, Appointment> idToAppointment;
	public AppointmentService() {
		idToAppointment = new HashMap<String, Appointment>();
	}

public void addAppointment (Appointment appointment) {
	if(idToAppointment.containsKey(appointment.getAppointmentId())){
		throw new IllegalArgumentException ("Duplicate Appointment ID");
	}
	idToAppointment.put(appointment.getAppointmentId(), appointment);
}

public void deleteAppointment(String appointmentId){
	if (!idToAppointment.containsKey(appointmentId)) {
		throw new IllegalArgumentException("Appointment ID Does not exist");
	}
	idToAppointment.remove(appointmentId);
 }

public Appointment getAppointment(String appointmentId) {
	if (!idToAppointment.containsKey(appointmentId)) {
		throw new IllegalArgumentException("Appointment ID Does not exist");
	}
	return idToAppointment.get(appointmentId);
}
}

/*java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.  As discussed in module 5, the appointment object shall have a required appointment Date field. The appointment Date field cannot be in the past. The appointment Date field shall not be null.
Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.

Here is one method of doing this (please note your variable names may be different) 

@Test

      void testAddAppointmentSuccess() {

       Date currentDate = new Date(System.currentTimeMillis());

       Date afterToday = new Date(currentDate.getTime() + 10);   

             Appointment appointment = new Appointment("12345", afterToday, "Description");           

             assertTrue(appointmentService.addAppointment(appointment));         

             appointment = appointmentService.getAppointment(appointment.getAppointmentId()); 

             assertTrue(appointment.getAppointmentDate().compareTo(afterToday) == 0);

             assertTrue(appointment.getAppointmentId().equals("12345"));

             assertTrue(appointment.getAppointmentDescription().equals("Description"));

      }*/