package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivityFileEntity;
import lombok.Getter;

@Getter
public class ActivityFile {

	private final Long id;
	private final int order;
	private final String url;
	private final Long activityId;

	public ActivityFile(Long id, int order, String url, Long activityId) {
		this.id = id;
		this.order = order;
		this.url = url;
		this.activityId = activityId;
	}

	public static ActivityFile fromEntity(ActivityFileEntity entity) {
		return new ActivityFile(
			entity.getId(),
			entity.getOrder(),
			entity.getUrl(),
			entity.getActivityId()
		);
	}
}
