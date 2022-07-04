package upc.edu.pe.EF.services;

import upc.edu.pe.EF.entities.Lodgement;

import java.util.List;

public interface LodgementService {
    Lodgement findById(Long id);
    List<Lodgement> findAll();
    Lodgement createLodgement(Lodgement lodgement);
}
