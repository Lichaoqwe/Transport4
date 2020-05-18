package com.company;

import java.util.Date;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/4/7 12:00
 * @version: 1.0
 * @modified By:
 */
public abstract class Transport {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;
//驾驶方法
    public abstract void drivingMethod();
    //装载
    public abstract void load();
    //保养
    public abstract void maintain();
    //加油
    public abstract void addGas();


    public Transport(String id) {
        this.id = id;
    }

    public Transport() {
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
