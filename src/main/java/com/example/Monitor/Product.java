package com.example.Monitor;

import javax.persistence.*;


import org.springframework.stereotype.Component;

@Component

@Entity


public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int pid;

    @Column
    private String pname;

    @Column
    private boolean touchscreen;

    @Column
    private String weight;

    @Column
    private int size;

    @Column
    private String category;

    @Column
    private boolean transportMonitor;

    @Column
    private boolean waterproof;

    public Product() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isTransportMonitor() {
        return transportMonitor;
    }

    public void setTransportMonitor(boolean transportMonitor) {
        this.transportMonitor = transportMonitor;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }







    @Override
    public String toString(){
        return "Product [pid=" + pid + ", pname=" + pname + ", touchscreen=" + touchscreen + ", weight=" + weight +" size=" + size + ", category=" + category + "transportMonitor" + transportMonitor + "]";
    }
}







