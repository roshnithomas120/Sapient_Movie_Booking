package com.example.entities;

import java.time.LocalDateTime;

public class Show {
    private String movieID;
    private String movieName;
    private LocalDateTime movieDate;
    private String imageURL;
    private Screen screen;

    public Show(String movieID,String movieName, LocalDateTime movieDate, String imageURL, Screen screen) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.imageURL = imageURL;
        this.screen = screen;
    }

    public String getMovieID() {
        return movieID;
    }


    public String getMovieName() {
        return movieName;
    }


    public LocalDateTime getMovieDate() {
        return movieDate;
    }



    public String getImageURL() {
        return imageURL;
    }

    public Screen getScreen() {
        return screen;
    }
}
