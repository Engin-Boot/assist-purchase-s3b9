package com.example.Monitor;

import javax.persistence.*;


import org.springframework.stereotype.Component;

import java.util.Objects;

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
    private int size;

    @Column
    private String category;

    @Column
    private boolean transportMonitor;


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

    @Override
    public String toString(){
        return "Product [pid=" + pid + ", pname=" + pname + ", touchscreen=" + touchscreen +" size=" + size + ", category=" + category + "transportMonitor" + transportMonitor + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return pid == product.pid;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(pid);
//    }
}







