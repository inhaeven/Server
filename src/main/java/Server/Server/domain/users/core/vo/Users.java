package Server.Server.domain.users.core.vo;

import Server.Server.domain.users.core.entity.UsersEntity;
import Server.Server.domain.users.core.entity.enums.UsersRole;
import lombok.Getter;

@Getter
public class Users {

	private final Long id;
	private final String name;
	private final String email;
	private final String profileImage;
	private final UsersRole role;

	public Users(Long id, String name, String email, String profileImage, UsersRole role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.profileImage = profileImage;
		this.role = role;
	}

	public static Users fromEntity(UsersEntity entity) {
		return new Users(
			entity.getId(),
			entity.getName(),
			entity.getEmail(),
			entity.getProfileImage(),
			entity.getRole()
		);
	}
}
