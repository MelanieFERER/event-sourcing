package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class RetractProductFromCatalog extends DomainEvent<Product>{

    public RetractProductFromCatalog(UUID uuid) {
        super(uuid);
    }



}
