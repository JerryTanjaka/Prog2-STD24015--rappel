package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class Teacher extends User{
    private String speciality;
    public Teacher(int id, String firstName, String name, LocalDate birthdate, String email, String phoneNumber, String specialty) {
        super(id, firstName, name, birthdate, email, phoneNumber);
        this.speciality = specialty;
    }
}