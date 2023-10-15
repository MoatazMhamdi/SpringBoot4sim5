package com.esprit.springp.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Chambre implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    ///////////
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
   private typechambre typeC;
    ///////////
    @ManyToOne
    Bloc bloc;
    /////////////
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;

}
