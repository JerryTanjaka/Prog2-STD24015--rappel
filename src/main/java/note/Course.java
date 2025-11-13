package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
    private List<Exam> examsList = new ArrayList<>();
    public Course(int id, String label, int credits, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
        this.examsList = new ArrayList<>();
    }
}
