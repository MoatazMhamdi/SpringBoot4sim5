package com.esprit.springp.Entity;

import jakarta.persistence.*;
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
public class Foyer implements Serializable {
    @Id
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private long idFoyer;
    private String nomFoyer;
    private long capitaleFoyer;
    /////////
    @OneToOne(mappedBy="foyer")
    private Universite universite;
    /////////////
    @OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
    private Set<Bloc> Blocs;
}
