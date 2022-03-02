package ee.agileworks.proovitoo.helpdesk;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TicketService {

    public TicketDto createNewTicket() {

        TicketDto ticket = new TicketDto();

        ticket.setUserName("uusKasutaja");
        ticket.setDescription("On vaja luua uus pöördumine");
        ticket.setEnteredDate(LocalDate.now());
        ticket.setDueDate(LocalDate.of(2022, 04, 03));
        return ticket;
    }
}
