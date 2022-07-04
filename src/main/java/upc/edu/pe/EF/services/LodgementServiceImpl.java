package upc.edu.pe.EF.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.EF.entities.Lodgement;
import upc.edu.pe.EF.repositories.LodgementRepositoy;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LodgementServiceImpl implements LodgementService{
    @Autowired
    private LodgementRepositoy lodgementRepositoy;

    @Override
    public Lodgement findById(Long id) { return lodgementRepositoy.findById(id).orElse(null); }

    @Override
    public List<Lodgement> findAll() {
        return lodgementRepositoy.findAll();
    }

    @Override
    public Lodgement createLodgement(Lodgement product) {
        Lodgement lodgement1 = new Lodgement();
        lodgement1.setName(product.getName());
        lodgement1.setPrice(product.getPrice());
        lodgement1.setArrivalDay(product.getArrivalDay());
        lodgement1.setExitDay(product.getExitDay());
        return lodgementRepositoy.save(lodgement1);
    }
}
