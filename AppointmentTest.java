package src;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppointmentTest {
  @Test
  public void invalidAppointmentId() {
      Appointment appointment = new Appointment();
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
    	  appointment.setAppointmentId("0000798789070981");
      });
   }
  @Test
  public void invalidAppointmentDate() {
      Appointment appointment = new Appointment();
      Date date = new Date(System.currentTimeMillis() - 100000);
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
    	  appointment.setDate(date);
      });
  }
  @Test
  public void invalidAppointmentDescription() {
      Appointment appointment = new Appointment();
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
    	  appointment.setDescription("jkld;ajflkjds;lkfajd;lkfjdsakljdkjf;lkasjfkdsksjda;fklksajf;lkjf;lkdsajflkdsjalkfdjslkajdflkd");
      });
  }
}
