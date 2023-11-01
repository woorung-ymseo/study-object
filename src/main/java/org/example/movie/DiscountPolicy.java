package org.example.movie;

public interface DiscountPolicy {

    Money calculationDiscountAmount(Screening screening);
}
