package com.example.entities;

import java.util.List;

public class Partner {
    private int partnerID;
    private String partnerName;
    private List<Theatre> theatres;

    public Partner(int partnerID, String partnerName, List<Theatre> theatres) {
        this.partnerID = partnerID;
        this.partnerName = partnerName;
        this.theatres = theatres;
    }

    public int getPartnerID() {
        return partnerID;
    }


    public String getPartnerName() {
        return partnerName;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }
}
