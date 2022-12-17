package com.duyhelloworld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher extends BigE_Person{
    @Column(name = "which_class")
    private String whichClass;
    @Column
    private Integer yearOfExp;


    public String getWhichClass() {
        return this.whichClass;
    }

    public void setWhichClass(String whichClass) {
        this.whichClass = whichClass;
    }

    public Integer getYearOfExp() {
        return this.yearOfExp;
    }

    public void setYearOfExp(Integer yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

}
