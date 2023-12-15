package co.simplon.alt6.eventsourcing.domain;

public interface Publisher<T> {

    void publish(DomainEvent<T> event);
}
