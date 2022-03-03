package ee.agileworks.proovitoo.helpdesk;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Service
public class TicketSystem {

    private List<RequestResult> tickets = new ArrayList<>();
    private int ticketIdCounter = 1;

    public void addTicketToTickets(RequestResult requestResult) {
        tickets.add(requestResult);
    }

    public void incrementTicketIdCounter() {
        ticketIdCounter++;
    }
}
