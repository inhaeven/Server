package Server.Server.domain.user.core.vo;

import Server.Server.domain.user.core.entity.UserEntity;
import Server.Server.domain.user.core.entity.enums.UserRole;
import lombok.Getter;

@Getter
public class User {

	private final Long id;
	private final String name;
	private final String email;
	private final String profileImage;
	private final UserRole role;

	public User(Long id, String name, String email, String profileImage, UserRole role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.profileImage = profileImage;
		this.role = role;
	}

	public static User fromEntity(UserEntity entity) {
		return new User(
			entity.getId(),
			entity.getName(),
			entity.getEmail(),
			entity.getProfileImage(),
			entity.getRole()
		);
	}
}
