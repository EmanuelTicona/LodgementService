package upc.edu.pe.EF.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.EF.entities.Lodgement;
import upc.edu.pe.EF.services.LodgementService;

import java.util.List;

@Slf4j
@Controller
@RestController
@RequestMapping("/lodgement")
public class LodgementController {
    @Autowired
    private LodgementService lodgementService;

    @GetMapping("/getAllLodgements")
    public List<Lodgement> getAllLodgements() { return lodgementService.findAll(); }

    @GetMapping("/getLodgementById/{id}")
    public Lodgement getLodgementById(@PathVariable("id") Long id) {
        return lodgementService.findById(id);
    }

    @PostMapping("/createLodgement")
    public Lodgement createLodgement(@RequestBody Lodgement lodgement) {
        return lodgementService.createLodgement(lodgement);
    }
}
