package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class ChangeProductPrice extends DomainEvent {
    private Double newPrice;

    public ChangeProductPrice(UUID uuid, Double newPrice) {
        super(uuid);
        this.newPrice = newPrice;
    }

    public Double getNewPrice() {
        return newPrice;
    }
}
