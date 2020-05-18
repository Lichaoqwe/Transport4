package com.company;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/4/7 11:59
 * @version: 1.o
 * @modified By:
 */
public class Person {
    private String id;
    private String p_Name;
    private String p_Sex;
    private String p_Age;
    public void driveTransport(Transport transport) {
        transport.drivingMethod();
    }//调用的是子类的behaviorEat

    public Person(String id) {
        this.id = id;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getP_Age() {
        return p_Age;
    }

    public void setP_Age(String p_Age) {
        this.p_Age = p_Age;
    }
}
