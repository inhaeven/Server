package Server.Server.domain.users.core.entity;

import Server.Server.domain.users.core.entity.enums.UsersRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = UsersTableConstants.TABLE_USERS)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = UsersTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = UsersTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = UsersTableConstants.COLUMN_EMAIL, nullable = false, unique = true)
	private String email;

	@Column(name = UsersTableConstants.COLUMN_PROFILE_IMAGE)
	private String profileImage;

	@Enumerated(EnumType.STRING)
	@Column(name = UsersTableConstants.COLUMN_ROLE, nullable = false)
	private UsersRole role;

	@Builder
	public UsersEntity(String name, String email, String profileImage, UsersRole role) {
		this.name = name;
		this.email = email;
		this.profileImage = profileImage;
		this.role = role;
	}
}
