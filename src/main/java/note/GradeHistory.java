package note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@Getter
@Setter
public class GradeHistory {
    private double newValue;
    private Instant modificationDate;
    private String reason;
}
