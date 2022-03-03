package ee.agileworks.proovitoo.helpdesk;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/helpdesk")
public class TicketController {

    @Resource
    private TicketService ticketService;

    @Resource
    private TicketSystem ticketSystem;

    @GetMapping("/ticket")
    public TicketSystem getAllTicket() {
        return ticketSystem;
    }

    @PostMapping("/new/ticket")
    public List<RequestResult> createNewTicket(@RequestBody TicketDto ticketDto) {
        RequestResult result = ticketService.addNewTicket(ticketDto);
        ticketSystem.addTicketToTickets(result);
        List<RequestResult> tickets = ticketSystem.getTickets();
        return tickets;
    }
}
