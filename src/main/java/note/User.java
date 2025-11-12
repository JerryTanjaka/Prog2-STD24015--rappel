package note;

import java.time.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate BirthDate;
    private String email;
    private String phoneNumber;
}