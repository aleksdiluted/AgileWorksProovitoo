package ee.agileworks.proovitoo.helpdesk;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/helpdesk")
public class TicketController {

    public static Ticket ticket = new Ticket();

    @Resource
    private TicketService ticketService;

    @GetMapping("/ticket")
    public Ticket getTicket() {
        return ticket;
    }

    @GetMapping("/new/ticket")
    public TicketDto controllerGetNewTicket() {
        TicketDto newTicket = ticketService.createNewTicket();
        return newTicket;
    }
}
