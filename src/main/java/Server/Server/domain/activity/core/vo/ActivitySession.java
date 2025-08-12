package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivitySessionEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ActivitySession {

	private final Long id;
	private final Long activityId;
	private final LocalDateTime startTime;

	public ActivitySession(Long id, Long activityId, LocalDateTime startTime) {
		this.id = id;
		this.activityId = activityId;
		this.startTime = startTime;
	}

	public static ActivitySession fromEntity(ActivitySessionEntity entity) {
		return new ActivitySession(
			entity.getId(),
			entity.getActivityId(),
			entity.getStartTime()
		);
	}
}
