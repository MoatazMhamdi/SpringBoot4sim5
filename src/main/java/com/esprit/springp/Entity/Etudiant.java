package com.esprit.springp.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Etudiant implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    /////////
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;
    ///////////
    @ManyToMany(mappedBy="Etudients", cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;


}
