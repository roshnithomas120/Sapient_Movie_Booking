package com.example.repository;

import com.example.entities.Show;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ShowRepository {

    List<Show> getShows(Map<String,String> filter);
}
