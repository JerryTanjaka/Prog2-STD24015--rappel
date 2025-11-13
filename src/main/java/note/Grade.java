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
private double InitialValue;
private List<GradeHistory> historyList = new ArrayList<>();

}
