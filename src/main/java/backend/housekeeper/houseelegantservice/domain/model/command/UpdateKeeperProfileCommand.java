package backend.housekeeper.houseelegantservice.domain.model.command;

import java.util.Date;

public record UpdateKeeperProfileCommand(Long id, String firstName, String lastName, Date birthdate,int number,String email) {
}