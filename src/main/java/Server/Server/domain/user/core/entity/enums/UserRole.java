package Server.Server.domain.user.core.entity.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum UserRole {
	GUEST("이용자"),
	HOST("제공자")
	;

	private final String userRole;
}
