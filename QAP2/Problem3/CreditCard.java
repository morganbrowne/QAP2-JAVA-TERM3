package QAP2.Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit)
    {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    public Money getBalance()
    {
        // method to get the balance returns copy of the "Money" object..
        return new Money(balance); 
    }

    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }

    // Method to get personal details from card holder (Accessor)...
    public String getPersonals()
    {
        return owner.toString();
    }

    // Method Charging amount to card, if not within credit limit prints over credit linit... 
    public void charge(Money amount)
    {
        Money newBalance = new Money(balance);
        newBalance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0 ) {
            balance.add(amount);
            System.out.println("Charge: " + amount);
 
        } else {
            System.out.println("Over cerdit limit: ");
        }
    }

    public void payment(Money amount)
    {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }




}
