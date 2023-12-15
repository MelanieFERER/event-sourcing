package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class ChangeProductSpecification extends DomainEvent {
    private String newLabel;
    private String newDescription;

    public ChangeProductSpecification(UUID uuid, String newLabel, String newDescription) {
        super(uuid);
        this.newLabel = newLabel;
        this.newDescription = newDescription;
    }
    
    public String getNewLabel() {
        return newLabel;
    }
    public String getNewDescription() {
        return newDescription;
    }
}
