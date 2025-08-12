package Server.Server.domain.users.core.entity.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UsersRole {
	GUEST("이용자"),
	HOST("제공자")
	;

	private final String usersRole;
}
