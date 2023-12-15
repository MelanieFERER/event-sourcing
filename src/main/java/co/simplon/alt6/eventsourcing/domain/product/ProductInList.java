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
    private Integer rating = 0;

    private Integer ratingNb = 0;
    private Integer currentSales = null;
    


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
        if(event instanceof ChangeProductPrice changePrice) {
            currentPrice = changePrice.getNewPrice();
        }
        if(event instanceof ReceiveProductInStock receiveProduct) {
            quantity += receiveProduct.getReceivedQuantity();
        }
        if(event instanceof LeaveReviewOnProduct review) {
            ratingNb++;
            rating += review.getRate();
        }
        if(event instanceof ChangeProductSpecification productSpec) {
            label = productSpec.getNewLabel();
        }
        if(event instanceof RetractProductFromCatalog retract) {
            active = false;
        }
        if(event instanceof AddProductToCart addToCart) {
            if(quantity > addToCart.getQuantity()) {
                quantity -= addToCart.getQuantity();
            }  
        }
        if(event instanceof PutProductOnSales sales) {
            if(sales.getTimestamp() + sales.getSalesDuration() > System.currentTimeMillis()) {
                currentSales = sales.getSalesPercentage();
            }
        }
    }

    public Float getRating() {
        return (float)rating/ratingNb;
    }

    public Double getCurrentPrice() {
        if(currentSales != null) {
            return currentPrice - (currentPrice*currentSales/100);
        }
        return currentPrice;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getLabel() {
        return label;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getActive() {
        return active;
    }

    public Integer getRatingNb() {
        return ratingNb;
    }

    public Integer getCurrentSales() {
        return currentSales;
    }
}
