package application.ports.out;

import application.dto.user.CreateUserRequest;
import domain.Room;

public interface RoomRepositoryPort {

    Room createRoom(CreateRoomRequest request);
}
