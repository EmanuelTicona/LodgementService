package upc.edu.pe.EF.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "tbl_lodgement")
@Data
@Entity
public class Lodgement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "name", length = 200)
    private String name;

    @NotNull
    @Column(name = "price")
    private Double price;

    @NotNull
    @Column(name = "arrival")
    private Date arrivalDay;

    @NotNull
    @Column(name = "exit")
    private Date exitDay;
}
