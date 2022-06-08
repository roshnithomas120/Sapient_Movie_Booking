package com.example.controller;

import com.example.entities.Partner;
import com.example.entities.Theatre;
import com.example.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("myapp/partner")
public class PartnerController {

    @Autowired
    PartnerRepository partnerRepository;

    @GetMapping("/{id}")
    public Partner getPartner(@PathVariable  int id){
        return partnerRepository.getPartnerById(id);
    }

    @GetMapping("")
    public List<Partner> getPartners(){
        return partnerRepository.getPartners();
    }

    @PostMapping("")
    public void addPartners(@RequestBody Partner newPartner){
        partnerRepository.addPartner(newPartner);
    }

    @PutMapping("theatres/{partnerID}")
    public void addTheatres(@RequestBody List<Theatre> theatres, @PathVariable int partnerID){
        Partner updatedPartner = addTheatreToPartner(partnerID, theatres);
        partnerRepository.updatePartner(updatedPartner);
    }

    private Partner addTheatreToPartner(int partnerID, List<Theatre> theatres) {
        Partner partner = partnerRepository.getPartnerById(partnerID);
        partner.getTheatres().addAll(theatres);

        return partner;
    }

}
