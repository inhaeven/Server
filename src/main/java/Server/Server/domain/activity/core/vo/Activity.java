package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivityEntity;
import Server.Server.domain.activity.core.entity.enums.ActivityType;
import lombok.Getter;

@Getter
public class Activity {

	private final Long id;
	private final Long hostId;
	private final String name;
	private final ActivityType type;
	private final String activityDescription;
	private final String hostDescription;
	private final int maxPeople;
	private final String location;
	private final int pricePerPerson;
	private final int durationMinutes;
	private final boolean isLiked;
	private final boolean isBadapass;
	private final int badapassDiscountRate;

	public Activity(Long id, Long hostId, String name, ActivityType type,
		String activityDescription, String hostDescription,
		int maxPeople, String location, int pricePerPerson,
		int durationMinutes, boolean isLiked,
		boolean isBadapass, int badapassDiscountRate) {
		this.id = id;
		this.hostId = hostId;
		this.name = name;
		this.type = type;
		this.activityDescription = activityDescription;
		this.hostDescription = hostDescription;
		this.maxPeople = maxPeople;
		this.location = location;
		this.pricePerPerson = pricePerPerson;
		this.durationMinutes = durationMinutes;
		this.isLiked = isLiked;
		this.isBadapass = isBadapass;
		this.badapassDiscountRate = badapassDiscountRate;
	}

	public static Activity fromEntity(ActivityEntity entity) {
		return new Activity(
			entity.getId(),
			entity.getHostId(),
			entity.getName(),
			entity.getType(),
			entity.getActivityDescription(),
			entity.getHostDescription(),
			entity.getMaxPeople(),
			entity.getLocation(),
			entity.getPricePerPerson(),
			entity.getDurationMinutes(),
			entity.isLiked(),
			entity.isBadapass(),
			entity.getBadapassDiscountRate()
		);
	}
}
