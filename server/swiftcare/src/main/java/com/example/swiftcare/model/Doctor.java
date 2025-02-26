package main.java.com.example.swiftcare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.Date;

@Document(collection = "doctors")
public class Doctor {
    
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String availabilityStatus;
    private String gender;  
    private String language;
    private List<String> specializations; //saving specialization _id values in a list here as reference
    private List<CalendarEntry> calendar; //embedding calendar entires within Doctor collection

    // Constructors
    public Doctor() {}

    public Doctor(String name, String email, String password, String availabilityStatus, String gender, String language, List<String> specializations, List<CalendarEntry> calendar) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.availabilityStatus = availabilityStatus;
        this.gender = gender;
        this.language = language;
        this.specializations = specializations;
        this.calendar = calendar;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAvailabilityStatus() { return availabilityStatus; }
    public void setAvailabilityStatus(String availabilityStatus) { this.availabilityStatus = availabilityStatus; }

    public String getGender() { return gender; }  
    public void setGender(String gender) { this.gender = gender; }  

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    
    public List<String> getSpecializations() { return specializations; }
    public void setSpecializations(List<String> specializations) { this.specializations = specializations; }

    public List<CalendarEntry> getCalendar() { return calendar; }
    public void setCalendar(List<CalendarEntry> calendar) { this.calendar = calendar; }
}
