package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class CreateProduct extends DomainEvent {
    private Double price;
    private String label;
    private Integer quantity;
    private String description;

    public CreateProduct(Double price, String label, Integer quantity, String description) {
        super(UUID.randomUUID());
        this.price = price;
        this.label = label;
        this.quantity = quantity;
        this.description = description;
    }


    public Double getPrice() {
        return price;
    }


    public String getLabel() {
        return label;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public String getDescription() {
        return description;
    }


}
