package org.fasttrackit.course8HW.code.person;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class oclasa {
    Programmer programmer;
    oclasa(Programmer programmer){
        this.programmer=programmer;
    }
    public String getFullName(){
        return programmer.getfirstName()+programmer.getlastName();
    }
    public int getAge(){
        return LocalDate.now().getYear()-programmer.getbirthday().getYear();

    }
}
