package infraestructure.drivens.jpa.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="ROOMS")
@Builder
@Getter
@Setter
public class RoomEntityJpa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<UserEntityJpa> users;


}
