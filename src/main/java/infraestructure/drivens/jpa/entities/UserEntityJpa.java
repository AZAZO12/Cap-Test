package infraestructure.drivens.jpa.entities;

import domain.RoleUserEnum;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="USERS")
@Builder
@Getter
@Setter
public class UserEntityJpa {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false, unique = true, length = 15)
    private String dni;

    @Column(nullable = false, unique = true, length = 15)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private RoleUserEnum role;

    @ManyToOne
    @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "fk_room"))
    private RoomEntityJpa room;

}
