package eidi.objektorientierung;

import java.time.LocalDate;

public class Airplane extends MeansOfTransportation implements PublicTransport{

    @Override
    public void move() {
        System.out.println("Flying!");
    }

    @Override
    public Ticket getTicket(Person person) {
        return new Ticket(this, LocalDate.now().plusMonths(2),person);
    }
}
