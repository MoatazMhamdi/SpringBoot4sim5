package com.esprit.springp.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Reservation implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    ///////
    private int idReservation;
    private Date anneUniversitaire;
    private Boolean estValid;
    /////////////
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> Etudiants;


}
