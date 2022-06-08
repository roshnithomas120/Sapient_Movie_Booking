package com.example.entities;

import java.util.List;

public class Screen {
    private long screenNo;
    private Theatre theatre;
    private List<Seat> seats;

    public long getScreenNo() {
        return screenNo;
    }

    public void setScreenNo(long screenNo) {
        this.screenNo = screenNo;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
