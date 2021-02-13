package eidi.objektorientierung;

import java.time.LocalDate;

public class Ticket {
    PublicTransport publicTransport;
    LocalDate validUntil;
    Person ticketOwner;

    public Ticket(PublicTransport publicTransport, LocalDate validUntil, Person ticketOwner) {
        this.publicTransport = publicTransport;
        this.validUntil = validUntil;
        this.ticketOwner = ticketOwner;
    }

    public PublicTransport getPublicTransport() {
        return publicTransport;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public Person getTicketOwner() {
        return ticketOwner;
    }
}
