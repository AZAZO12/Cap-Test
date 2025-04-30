package application.ports.out;

import application.dto.user.CreateUserRequest;
import domain.User;

public interface UserRepositoryPort {

    User createUser(CreateUserRequest request);

}
