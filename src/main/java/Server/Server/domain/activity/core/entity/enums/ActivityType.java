package Server.Server.domain.activity.core.entity.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActivityType {

	FOOD("음식/쿠킹"),
	CULTURE("문화/역사"),
	NATURE("자연/트레킹"),
	HANDCRAFT("공예/클래스"),
	WATER("수상/해양"),
	FARMING("농촌/체험"),
	ADVENTURE("액티비티");

	private final String activityType;
}
