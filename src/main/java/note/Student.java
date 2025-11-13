package note;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter

public class Student extends User{
    private String groupe;
    private Tutor tutor;
    private List<Grade> gradesList = new ArrayList<>();

    public Grade getGradeFromExam(Exam exam){
        return gradesList.stream()
                .filter(grade ->grade.getExam().equals(exam) )
                .findFirst()
                .orElse(null);
    }

}