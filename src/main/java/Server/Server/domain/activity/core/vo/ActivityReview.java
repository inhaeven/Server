package Server.Server.domain.activity.core.vo;

import java.time.LocalDateTime;

import Server.Server.domain.activity.core.entity.ActivityReviewEntity;
import lombok.Getter;

@Getter
public class ActivityReview {

	private final Long id;
	private final LocalDateTime createdAt;
	private final int rate;
	private final String content;
	private final String hostComment;
	private final LocalDateTime hostCommentCreatedAt;
	private final Long reviewerId;
	private final Long activityId;

	public ActivityReview(Long id,
		LocalDateTime createdAt,
		int rate,
		String content,
		String hostComment,
		LocalDateTime hostCommentCreatedAt,
		Long reviewerId,
		Long activityId) {
		this.id = id;
		this.createdAt = createdAt;
		this.rate = rate;
		this.content = content;
		this.hostComment = hostComment;
		this.hostCommentCreatedAt = hostCommentCreatedAt;
		this.reviewerId = reviewerId;
		this.activityId = activityId;
	}

	public static ActivityReview fromEntity(ActivityReviewEntity entity) {
		return new ActivityReview(
			entity.getId(),
			entity.getCreatedAt(),
			entity.getRate(),
			entity.getContent(),
			entity.getHostComment(),
			entity.getHostCommentCreatedAt(),
			entity.getReviewerId(),
			entity.getActivityId()
		);
	}
}
