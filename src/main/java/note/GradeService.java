package note;

import java.time.Instant;
import java.util.Comparator;

public class GradeService {
    public double getExamGrade(Exam exam, Student student, Instant t) {
        Grade grade = student.getGradeFromExam(exam);
        if (grade == null) {
            return 0.0;
        }
        GradeHistory last = grade.getHistoryList().stream()
                .filter(gh -> !gh.getModificationDate().isAfter(t))
                .max(Comparator.comparing(GradeHistory::getModificationDate))
                .orElse(null);
        return last != null ? last.getNewValue() : grade.getInitialValue();
    }
}
