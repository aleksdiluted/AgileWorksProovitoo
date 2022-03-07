package ee.agileworks.proovitoo.helpdesk;

import org.hibernate.type.LocalDateTimeType;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

@Service
public class TicketService {

    @Resource
    private TicketSystem ticketSystem;

    @Resource
    private RequestResult requestResult;

    public RequestResult addNewTicket(TicketDto ticketDto) {
        RequestResult ticket = new RequestResult();
        ticket.setUserName(ticketDto.getUserName());
        ticket.setDescription(ticketDto.getDescription());
        ticket.setEnteredDate(LocalDateTime.now());
        ticket.setDueDate(ticketDto.getDueDate());
        ticketSystem.incrementTicketIdCounter();
        ticket.setDueDateMinusOneHour(ticketDto.getDueDate().minusHours(3)); // -1h + (-2h) to take into account new Date() time in CET in front end
//        ticket.setTimeNow(LocalDateTime.now());
        return ticket;
    }

//    public LocalDateTime calculateDueDateMinusHour(TicketDto ticketDto) {
//        Instant minusOneHour = Instant.from(ticketDto.getDueDate()).minus(1, ChronoUnit.HOURS);
//        LocalDateTime dueDateMinusOneHour = ticketDto.getDueDate().minusHours(1);
//        return dueDateMinusOneHour;
//    }


}
