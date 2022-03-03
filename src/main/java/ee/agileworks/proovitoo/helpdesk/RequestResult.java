package ee.agileworks.proovitoo.helpdesk;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RequestResult {
    private String userName;
    private String description;
    private LocalDateTime enteredDate;
    private LocalDateTime dueDate;
}
