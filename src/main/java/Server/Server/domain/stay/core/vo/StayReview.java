package Server.Server.domain.stay.core.vo;

import java.time.LocalDateTime;

import Server.Server.domain.stay.core.entity.StayReviewEntity;
import lombok.Getter;

@Getter
public class StayReview {

	private final Long id;
	private final Long reviewerId;
	private final Long stayId;
	private final LocalDateTime createdAt;
	private final int rate;
	private final String content;
	private final String hostComment;
	private final LocalDateTime hostCommentCreatedAt;

	public StayReview(Long id, Long reviewerId, Long stayId, LocalDateTime createdAt,
		int rate, String content, String hostComment,
		LocalDateTime hostCommentCreatedAt) {
		this.id = id;
		this.reviewerId = reviewerId;
		this.stayId = stayId;
		this.createdAt = createdAt;
		this.rate = rate;
		this.content = content;
		this.hostComment = hostComment;
		this.hostCommentCreatedAt = hostCommentCreatedAt;
	}

	public static StayReview fromEntity(StayReviewEntity entity) {
		return new StayReview(
			entity.getId(),
			entity.getReviewerId(),
			entity.getStayId(),
			entity.getCreatedAt(),
			entity.getRate(),
			entity.getContent(),
			entity.getHostComment(),
			entity.getHostCommentCreatedAt()
		);
	}
}
