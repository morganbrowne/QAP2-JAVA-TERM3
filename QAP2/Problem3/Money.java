package QAP2.Problem3;

public class Money {
    private long dollars;
    private long cents;

    // Money constutor for double...
    public Money(double amount) 
    {
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }


    // Copy...
    public Money(Money other)
    {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public void add(Money other)
    {
        this.dollars += other.dollars; // Add dollars from the other Money object..
        this.cents += other.cents; // add cents...
        if (this.cents >= 100) { // If cents is equal to or greater than 100 
            this.dollars++; // Increase the dollar amount by 1..
            this.cents -= 100; // subtract 100 cents becuase 100 cents = 1 dollar.. 
        }
    }

    // Same as the above method but subtracting... 
    public void subtract(Money other)
    {
        this.dollars -= other.dollars;
        this.cents -= other.cents;
        if (this.cents < 0) {
            this.dollars--;
            this.cents +=100;
        }
    }


    // Method compares two Money objects "this" and "other"
    public int compareTo(Money other)
    {
        if (this.dollars == other.dollars && this.cents == other.cents) {
            return 0;
        } else if (this.dollars > other.dollars || (this.dollars == other.dollars && this.cents > other.cents)) {
            return 1;
        } else {
            return -1;
        }
    }


    // "equals" method compares to ee if the two money objects are the same... 
    public boolean equals(Money other)
    {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    //
    public String toString() 
    {
        return String.format("$%d.%02d", dollars, cents);
    }

    
}

