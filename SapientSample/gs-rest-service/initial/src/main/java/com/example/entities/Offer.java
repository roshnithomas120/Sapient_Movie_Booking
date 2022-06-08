package com.example.entities;

public class Offer {

    private String offerCode;

    public long applyOffer(long originalProce, int discount){
        return originalProce*discount/100;
    }
}
