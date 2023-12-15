package co.simplon.alt6.eventsourcing.domain;

import java.util.UUID;

public abstract class DomainEvent<T> {
    private UUID uuid;
    private Long timestamp = System.currentTimeMillis();



    public DomainEvent(UUID uuid) {
        this.uuid = uuid;
    }


    public Long getTimestamp() {
        return timestamp;
    }

    public UUID getUuid() {
        return uuid;
    }

    

}
