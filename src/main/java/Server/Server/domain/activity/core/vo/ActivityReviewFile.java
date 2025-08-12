package Server.Server.domain.activity.core.vo;

import Server.Server.domain.activity.core.entity.ActivityReviewFileEntity;
import lombok.Getter;

@Getter
public class ActivityReviewFile {

	private final Long id;
	private final int sequence;
	private final String url;
	private final Long activityReviewId;

	public ActivityReviewFile(Long id, int sequence, String url, Long activityReviewId) {
		this.id = id;
		this.sequence = sequence;
		this.url = url;
		this.activityReviewId = activityReviewId;
	}

	public static ActivityReviewFile fromEntity(ActivityReviewFileEntity entity) {
		return new ActivityReviewFile(
			entity.getId(),
			entity.getSequence(),
			entity.getUrl(),
			entity.getActivityReviewId()
		);
	}
}
