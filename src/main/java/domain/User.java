package domain;

import lombok.Getter;
import lombok.Setter;


public class User {

    private Long id;
    private String name;
    private String email;
    private String dni;
    private String phone;
    private RoleUserEnum role;
    private String roomId;

}
