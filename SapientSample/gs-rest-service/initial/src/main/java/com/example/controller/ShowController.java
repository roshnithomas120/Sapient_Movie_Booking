package com.example.controller;

import com.example.entities.Partner;
import com.example.entities.Show;
import com.example.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("myapp/show")
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    @GetMapping()
    public List<Show> getShows(@RequestParam Map<String,String> qparams){

        return showRepository.getShows(qparams);
    }

}
