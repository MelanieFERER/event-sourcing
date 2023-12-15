package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class AddProductToCart extends DomainEvent {
    private Integer quantity;
    private UUID user;
    public AddProductToCart(UUID uuid, Integer quantity, UUID user) {
        super(uuid);
        this.quantity = quantity;
        this.user = user;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public UUID getUser() {
        return user;
    }
}
