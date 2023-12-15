package co.simplon.alt6.eventsourcing.domain.product;

import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;

public class LeaveReviewOnProduct extends DomainEvent {
    private String comment;
    private Integer rate;
    private UUID user;
    public LeaveReviewOnProduct(UUID uuid, String comment, Integer rate, UUID user) {
        super(uuid);
        this.comment = comment;
        this.rate = rate;
        this.user = user;
    }
    public String getComment() {
        return comment;
    }
    public Integer getRate() {
        return rate;
    }
    public UUID getUser() {
        return user;
    }

}
