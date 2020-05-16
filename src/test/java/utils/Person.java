package utils;

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private Date birthdate;

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setBirthdate(Date date) {
        this.birthdate = date;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Date getBirthdate(){
        return this.birthdate;
    }
}
