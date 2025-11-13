package note;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student extends User {
    private String groupe;
    private Tutor tutor;
    private List<Grade> gradesList = new ArrayList<>();

    public Student(int id, String firstName, String name, LocalDate birthdate, String email, String phoneNumber,String groupe,Tutor tutor) {
        super(id, firstName, name, birthdate, email, phoneNumber);
        this.groupe = groupe;
        this.tutor = tutor;
    }
    public Grade getGradeForExam(Exam exam) {
        return gradesList.stream()
                .filter(g -> g.getExam().equals(exam))
                .findFirst()
                .orElse(null);
    }
}