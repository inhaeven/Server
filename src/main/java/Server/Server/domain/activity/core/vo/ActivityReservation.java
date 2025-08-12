package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivityReservationEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ActivityReservation {

	private final Long id;
	private final Long guestId;
	private final Long activitySessionId;
	private final int guestCount;
	private final LocalDateTime createdAt;

	public ActivityReservation(Long id, Long guestId, Long activitySessionId,
		int guestCount, LocalDateTime createdAt) {
		this.id = id;
		this.guestId = guestId;
		this.activitySessionId = activitySessionId;
		this.guestCount = guestCount;
		this.createdAt = createdAt;
	}

	public static ActivityReservation fromEntity(ActivityReservationEntity entity) {
		return new ActivityReservation(
			entity.getId(),
			entity.getGuestId(),
			entity.getActivitySessionId(),
			entity.getGuestCount(),
			entity.getCreatedAt()
		);
	}
}
