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
public class Bloc implements Serializable {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude

    private Long idBloc;
    private String nomBloc;
    private Long capitaleBloc;
    //////////
    @ManyToOne
    Foyer foyer;
    /////////
    @OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
    private Set<Chambre> Chambres;
}
