package ee.agileworks.proovitoo.helpdesk;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helpdesk")
public class TicketController {

    public static Ticket ticket = new Ticket();

    @GetMapping("/ticket")
    public Ticket getTicket() {
        return ticket;
    }
}
