package net.smallacademy.authenticatorapp;

public class person
{
    // Variable to store data corresponding
    // to firstname keyword in database
    private String firstname;

    // Variable to store data corresponding
    // to lastname keyword in database
    private String lastname;

    // Variable to store data corresponding
    // to age keyword in database
    private String age;

    // Mandatory empty constructor
    // for use of FirebaseUI
    public person() {}

    // Getter and setter method
    public String getFirstname()
    {
        return firstname;
    }
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public String getLastname()
    {
        return lastname;
    }
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public String getAge()
    {
        return age;
    }
    public void setAge(String age)
    {
        this.age = age;
    }
}