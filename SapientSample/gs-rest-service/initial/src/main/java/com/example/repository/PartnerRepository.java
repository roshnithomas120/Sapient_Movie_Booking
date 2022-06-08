package com.example.repository;

import com.example.entities.Partner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartnerRepository{
     Partner getPartnerById(int id);

     List<Partner> getPartners();

     void addPartner(Partner newPartner);

     void updatePartner(Partner newPartner);
}
