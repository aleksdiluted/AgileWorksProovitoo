package ee.agileworks.proovitoo.helpdesk;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Getter
@Setter
@Service
public class RequestResult {
    private String userName;
    private String description;
    private LocalDateTime enteredDate;
    private LocalDateTime dueDate;
    private LocalDateTime dueDateMinusOneHour;
//    private LocalDateTime timeNow;
}
