package com.esprit.springp.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Universite  implements Serializable {

    @Id
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude

    private long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyer;
}
