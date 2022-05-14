package com.eldar.fee.models;

public class FeeModel {
    private String name;
    private float fee;

    public FeeModel() {
    }

    public FeeModel(String name, float fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getfee() {
        return fee;
    }

    public void setfee(float fee) {
        this.fee = fee;
    }

    
}
