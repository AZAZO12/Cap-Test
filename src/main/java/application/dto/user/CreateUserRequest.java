package application.dto.user;

import domain.RoleUserEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {

    private String name;
    private String email;
    private String dni;
    private String phone;
    private RoleUserEnum role;
    private Long roomId;

}
