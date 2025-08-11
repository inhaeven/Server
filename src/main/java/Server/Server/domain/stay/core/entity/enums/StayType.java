package Server.Server.domain.stay.core.entity.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StayType {
	GUEST_HOUSE("게스트 하우스"),
	HANOK("한옥"),
	PRIVATE_HOUSE("독채"),
	PENSION("펜션"),
	CAMPING("캠핑")
	;

	private final String stayType;
}
