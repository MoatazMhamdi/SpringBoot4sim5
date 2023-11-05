package tn.esprit.springproject.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;
    @ManyToMany ( cascade = CascadeType.ALL)
    Set<Etudiant> etudiants;

}

