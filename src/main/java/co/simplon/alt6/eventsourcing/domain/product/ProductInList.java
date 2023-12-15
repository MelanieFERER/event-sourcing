package co.simplon.alt6.eventsourcing.domain.product;

import java.util.List;
import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class ProductInList {
    private UUID uuid;
    private String label;
    private Integer quantity;
    private Boolean active = true;
    private Double currentPrice;
    private Integer rating = null;
    


    public ProductInList(List<DomainEvent> events) {
        for (DomainEvent event : events) {
            apply(event);
        }
    }

    private void apply(DomainEvent event) {
        if(event instanceof CreateProduct createEvent) {
            uuid = createEvent.getUuid();
            label = createEvent.getLabel();
            currentPrice = createEvent.getPrice();
            quantity = createEvent.getQuantity();
        }
    }
}
