package org.example.object.movie;

public interface DiscountPolicy {

    Money calculationDiscountAmount(Screening screening);
}
