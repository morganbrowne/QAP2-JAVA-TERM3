package QAP2.Problem3;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String lasrName, String firstName, Address home)
    {
        this.lastName = lasrName;
        this.firstName = firstName;
        this.home = home;
    }

    public String toString() 
    {
        return firstName + " " + lastName + ", " + home.toString();
    }
}

