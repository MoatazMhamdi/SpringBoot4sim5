package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Bloc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBloc;
    private String nomBloc;
    @ManyToOne
    Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy ="bloc")
    Set<Chambre> chambres;
}

