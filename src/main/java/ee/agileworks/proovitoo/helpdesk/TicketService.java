package ee.agileworks.proovitoo.helpdesk;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class TicketService {

    @Resource
    private TicketSystem ticketSystem;

    public RequestResult addNewTicket(TicketDto ticketDto) {
        RequestResult ticket = new RequestResult();
        ticket.setUserName(ticketDto.getUserName());
        ticket.setDescription(ticketDto.getDescription());
        ticket.setEnteredDate(LocalDateTime.now());
        ticket.setDueDate(ticketDto.getDueDate());
        ticketSystem.incrementTicketIdCounter();
        ticket.setDueDateMinusOneHour(ticketDto.getDueDate().minusHours(3)); // -1h + (-2h) to take into account new Date() time in CET in frontend
        return ticket;
    }
}
