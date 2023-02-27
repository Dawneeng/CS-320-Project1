package src;
import java.util.Date;

public class Appointment {
    //private access modifier for encapsulation
    private String appointmentId;
    private Date date;
    private String description;
    //Public constructor of Appointment object which accepts 3 String parameters
    public Appointment(String appointmentId, Date date, String description) {
        this.appointmentId = appointmentId; //no longer than 10 letters
        this.date = date; //Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
        this.description = description; //no longer than 50 letters
    }
    
    public Appointment() {
   
    }
    //set and get functions
    public String getAppointmentId() {
        return this.appointmentId;
    }
    public void setAppointmentId(String appointmentId) {
    	if (appointmentId == null || appointmentId.length() > 10) {
    		throw new IllegalArgumentException();
    	}
        this.appointmentId = appointmentId;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
    	Date currDate = new Date(System.currentTimeMillis());
    	if (date == null || currDate.compareTo(date) > 0) {
    		throw new IllegalArgumentException();
    	}
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
    	if (description == null || description.length() > 50) {
    		throw new IllegalArgumentException();
    	}
        this.description = description;
    }
}

