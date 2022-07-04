package upc.edu.pe.EF.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import upc.edu.pe.EF.entities.Lodgement;

import java.util.List;

@Repository
@Qualifier("lodgementRepository")
public interface LodgementRepositoy extends JpaRepository<Lodgement, Long> {
}
