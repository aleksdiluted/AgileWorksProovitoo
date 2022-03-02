package ee.agileworks.proovitoo.helpdesk;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Ticket {

    private List<TicketDto> ticketDtoList = new ArrayList<>();



}
