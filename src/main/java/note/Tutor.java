package note;

import lombok.AllArgsConstructor;

import java.time.LocalDate;


public class Tutor extends User{
    private String relationship;
    public Tutor(int id, String firstName, String name, LocalDate birthdate, String email, String phoneNumber, String relationship) {
        super(id, firstName, name, birthdate, email, phoneNumber);
        this.relationship = relationship;
    }
}
