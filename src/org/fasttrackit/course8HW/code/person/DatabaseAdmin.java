package org.fasttrackit.course8HW.code.person;

import java.util.Date;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;
    public DatabaseAdmin(String firstName, String lastName, Date dateOfEmployement, String position, String adress, Date birthday, String dbTechnology) {
        super(firstName, lastName, dateOfEmployement, position, adress, birthday);
        this.dbTechnology=dbTechnology;
    }

    @Override
    public String getPosition() {
        return "Database Admin";
    }

    @Override
    public String getaddress() {
        return super.getaddress()+"Db admin";
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
}

