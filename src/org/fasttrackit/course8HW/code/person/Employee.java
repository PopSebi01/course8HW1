package org.fasttrackit.course8HW.code.person;

import java.util.Date;

public class Employee implements Person {
    private String FirstName;
    private String LastName;

    private Date dateOfEmployement;
    private String position;

    public Employee(String firstName, String lastName, Date dateOfEmployement, String position, String adress, Date birthday) {
        FirstName = firstName;
        LastName = lastName;
        this.dateOfEmployement = dateOfEmployement;
        this.position = position;
        this.adress = adress;
        this.birthday = birthday;
    }

    private String adress;
    private Date birthday;


    public String getPosition() {
        return position;
    }

    @Override
    public String getaddress() {
        return adress;
    }


    @Override
    public String getfirstName() {
        return FirstName;
    }

    @Override
    public String getlastName() {
        return LastName;
    }

    @Override
    public Date getbirthday() {
        return birthday;
    }
}



