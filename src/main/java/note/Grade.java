package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Grade {
    private Exam exam;
    private double initialValue;
    private List<GradeHistory> historyList = new ArrayList<>();

    public Grade(Exam exam, double initialValue) {
        this.exam = exam;
        this.initialValue = initialValue;
    }
}