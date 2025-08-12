package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivityReservedDateEntity;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ActivityReservedDate {

	private final Long id;
	private final Long reservationId;
	private final Long activityId;
	private final LocalDate reservedDate;

	public ActivityReservedDate(Long id, Long reservationId, Long activityId, LocalDate reservedDate) {
		this.id = id;
		this.reservationId = reservationId;
		this.activityId = activityId;
		this.reservedDate = reservedDate;
	}

	public static ActivityReservedDate fromEntity(ActivityReservedDateEntity entity) {
		return new ActivityReservedDate(
			entity.getId(),
			entity.getReservationId(),
			entity.getActivityId(),
			entity.getReservedDate()
		);
	}
}
