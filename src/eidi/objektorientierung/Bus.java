package eidi.objektorientierung;

import java.time.LocalDate;

public class Bus extends Vehicle implements PublicTransport{

    @Override
    public void move() {
        System.out.println("Driving!");
    }

    @Override
    public Ticket getTicket(Person person) {
        return new Ticket(this, LocalDate.now().plusDays(1),person);
    }
}
