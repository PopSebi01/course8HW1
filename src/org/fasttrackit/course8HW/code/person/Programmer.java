package org.fasttrackit.course8HW.code.person;

import java.util.Date;

public class Programmer extends Employee {
    private String language;

    public Programmer(String firstName, String lastName, Date dateOfEmployement, String position, String adress, Date birthday, String language) {
        super(firstName, lastName, dateOfEmployement, position, adress, birthday);
        this.language=language;
    }

    @Override
    public String getaddress() {
        return super.getaddress();
    }

    @Override
    public String getfirstName() {
        return super.getfirstName();
    }

    @Override
    public String getlastName() {
        return super.getlastName();
    }

    @Override
    public Date getbirthday() {
        return super.getbirthday();
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
