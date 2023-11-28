package org.example.object.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
