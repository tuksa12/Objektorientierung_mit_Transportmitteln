package eidi.objektorientierung;

import java.time.LocalDate;

public class Ship extends MeansOfTransportation implements PublicTransport{

    @Override
    public void move() {
        System.out.println("Swimming!");
    }

    @Override
    public Ticket getTicket(Person person) {
        return new Ticket(this, LocalDate.now().plusWeeks(3),person);
    }
}
