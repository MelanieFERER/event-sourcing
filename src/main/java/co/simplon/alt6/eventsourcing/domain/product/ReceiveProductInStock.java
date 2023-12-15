package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class ReceiveProductInStock extends DomainEvent {
    private Integer receivedQuantity;

    public ReceiveProductInStock(UUID uuid, Integer receivedQuantity) {
        super(uuid);
        this.receivedQuantity = receivedQuantity;
    }

    public Integer getReceivedQuantity() {
        return receivedQuantity;
    }
}
