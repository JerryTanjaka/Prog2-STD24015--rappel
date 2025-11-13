package note;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@DisplayName("Tests unitaires pour GradeService")
public class GradeServiceTest {
    private Student jerry;
    private Tutor parent;
    private Teacher mrBlade;
    private Course prog2;
    private Exam examFinal;
    private Exam examMidterm;
    private GradeService gradeService;
    @BeforeEach
    void setUp() {

        parent = new Tutor(1, "Jane", "Doe", LocalDate.of(1970, 5, 5), "parent@gmail.com", "0347654321", "Parent");
        jerry = new Student(1, "Jerry", "Doe", LocalDate.of(2000, 1, 1), "jerry@gmail.com", "0341234567", "K1", parent);
        mrBlade = new Teacher(2, "Will", "Smith", LocalDate.of(1980, 1, 1), "blade@gmail.com", "0341122334", "Backend");
        prog2 = new Course(1, "PROG2", 6, mrBlade);
        examMidterm = new Exam(1, "Midterm", prog2, LocalDateTime.parse("2024-06-15T10:00:00"), 2);
        examFinal = new Exam(2, "Final", prog2, LocalDateTime.parse("2024-06-30T10:00:00"), 3);

        prog2.getExamsList().add(examMidterm);
        prog2.getExamsList().add(examFinal);

        Grade gradeMidterm = new Grade(examMidterm, 10.0);
        gradeMidterm.getHistoryList().add(new GradeHistory(12.0, Instant.parse("2024-06-14T10:00:00Z"), "Correction"));
        Grade gradeFinal = new Grade(examFinal, 15.0);
        gradeFinal.getHistoryList().add(new GradeHistory(13.0, Instant.parse("2024-06-29T10:00:00Z"), "Révision"));

        jerry.getGradesList().add(gradeMidterm);
        jerry.getGradesList().add(gradeFinal);


        gradeService = new GradeService();
    }

    @Test
    @DisplayName("Vérifie la note d'un examen avant une date précise")
    void testGetExamGrade() {
        double note = gradeService.getExamGrade(examMidterm, jerry, Instant.parse("2024-06-15T09:00:00Z"));
        Assertions.assertEquals(12.0, note, 0.001);
    }
}
