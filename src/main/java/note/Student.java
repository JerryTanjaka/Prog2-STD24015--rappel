package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Student extends User{
    private String groupe;
    private Tutor tutor;
}
