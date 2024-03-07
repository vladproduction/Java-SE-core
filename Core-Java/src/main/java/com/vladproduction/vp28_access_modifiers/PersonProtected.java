package com.vladproduction.vp28_access_modifiers;

import com.vladproduction.vp28_access_modifiers.package1.Person;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class PersonProtected extends Person {

    public static final String CONSTANT_DEPARTMENT = "FINANCE";

    public String name;
    private int age;
    protected double bonus;

    public PersonProtected(double bonus) {
//        super(2024);
        this.bonus = bonus;
//        System.out.println(bonus);
    }

    public void setHiringYear(int hiringYear) {
        super.hiringYear = hiringYear;
    }

    @Override
    public String toString() {
        return "PersonProtected{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bonus=" + bonus +
                ", hiringYear=" + hiringYear +
                '}';
    }
}
