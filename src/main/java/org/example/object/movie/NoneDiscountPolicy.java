package org.example.object.movie;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculationDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
