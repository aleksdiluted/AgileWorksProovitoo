package ee.agileworks.proovitoo.helpdesk;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TicketDto {
    private String userName;
    private String description;
    private LocalDateTime dueDate;
}
