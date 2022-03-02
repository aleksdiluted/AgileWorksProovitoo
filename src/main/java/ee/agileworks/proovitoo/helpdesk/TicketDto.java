package ee.agileworks.proovitoo.helpdesk;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TicketDto {
    private int id;
    private String userName;
    private String description;
    private LocalDate enteredDate;
    private LocalDate dueDate;
}
