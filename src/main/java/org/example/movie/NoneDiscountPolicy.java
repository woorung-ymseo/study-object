package org.example.movie;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculationDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
