package com.publicis.poc.exceptionhandling;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws Exception{ //Since it is a subclass
        //Exception Handling
        if(!this.currency.equals(that.currency)){
            throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " " + that.currency);
        }

        this.amount = this.amount + that.amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}

class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String msg){
        super(msg);
    }
}


public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception{
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);

        amount1.add(amount2);

        System.out.println(amount1);
    }
}
