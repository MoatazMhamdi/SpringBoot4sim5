package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;
    @ManyToOne
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL )
    Set <Reservation> Reservations;



}
