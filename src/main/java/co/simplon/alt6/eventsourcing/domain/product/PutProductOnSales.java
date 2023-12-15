package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class PutProductOnSales extends DomainEvent {
    private Integer salesPercentage;
    private Integer salesDuration;



    public PutProductOnSales(UUID uuid, Integer salesPercentage, Integer salesDuration) {
        super(uuid);
        this.salesPercentage = salesPercentage;
        this.salesDuration = salesDuration;
    }


    public Integer getSalesDuration() {
        return salesDuration;
    }
    public Integer getSalesPercentage() {
        return salesPercentage;
    }

}
