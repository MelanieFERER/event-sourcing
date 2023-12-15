package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class PutProductOnSales extends DomainEvent {
    private Integer salesPercentage;
    
    public PutProductOnSales(UUID uuid, Integer salesPercentage) {
        super(uuid);
        this.salesPercentage = salesPercentage;
    }


    public Integer getSalesPercentage() {
        return salesPercentage;
    }

}
