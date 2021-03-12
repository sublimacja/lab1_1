package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money implements Comparable<Money>{

    private BigDecimal currency;
    private BigDecimal amount;

    public Money(BigDecimal currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }


    public BigDecimal getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Money o) {
        return this.amount.compareTo(o.amount);
    }


    public Money multiply(BigDecimal value){
        return new Money(amount.multiply(value), currency);
    }


    public Money subtract(BigDecimal discountValue) {
    }
}