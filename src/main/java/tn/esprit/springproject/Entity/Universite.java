package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne
    Foyer foyer;
}
