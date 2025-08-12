package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivityFileEntity;
import lombok.Getter;

@Getter
public class ActivityFile {

	private final Long id;
	private final int sequence;
	private final String url;
	private final Long activityId;

	public ActivityFile(Long id, int sequence, String url, Long activityId) {
		this.id = id;
		this.sequence = sequence;
		this.url = url;
		this.activityId = activityId;
	}

	public static ActivityFile fromEntity(ActivityFileEntity entity) {
		return new ActivityFile(
			entity.getId(),
			entity.getSequence(),
			entity.getUrl(),
			entity.getActivityId()
		);
	}
}
