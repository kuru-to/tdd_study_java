package money;

public class Money {
    protected int amount;
    private String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        if (object instanceof Money) {
            Money money = (Money) object;
            return amount == money.amount && currency.equals(money.currency);
        }
        return false;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
}
