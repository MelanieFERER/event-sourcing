package co.simplon.alt6.eventsourcing.domain;

public interface Publisher {

    void publish(DomainEvent event);
}
