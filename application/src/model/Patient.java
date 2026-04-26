package model;
import java.util.Date;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private String phone;
    private String address;

    public Patient(int id, String name, String surname, Date birthDate, String phone, String address) {
        this.id = id; this.name = name; this.surname = surname;
        this.birthDate = birthDate; this.phone = phone; this.address = address;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public Date getBirthDate() { return birthDate; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}