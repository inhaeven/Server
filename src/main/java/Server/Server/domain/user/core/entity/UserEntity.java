package Server.Server.domain.user.core.entity;

import Server.Server.domain.user.core.entity.enums.UserRole;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = UserTableConstants.TABLE_USER)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = UserTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = UserTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = UserTableConstants.COLUMN_EMAIL, nullable = false, unique = true)
	private String email;

	@Column(name = UserTableConstants.COLUMN_PROFILE_IMAGE)
	private String profileImage;

	@Enumerated(EnumType.STRING)
	@Column(name = UserTableConstants.COLUMN_ROLE, nullable = false)
	private UserRole role;

	@Builder
	public UserEntity(String name, String email, String profileImage, UserRole role) {
		this.name = name;
		this.email = email;
		this.profileImage = profileImage;
		this.role = role;
	}
}
