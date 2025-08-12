package Server.Server.domain.activity.core.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = ActivityReviewTableConstants.TABLE_ACTIVITY_REVIEW)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityReviewEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivityReviewTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivityReviewTableConstants.COLUMN_CREATED_AT, nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = ActivityReviewTableConstants.COLUMN_RATE, nullable = false)
	private int rate;

	@Column(name = ActivityReviewTableConstants.COLUMN_CONTENT, nullable = false, columnDefinition = "TEXT")
	private String content;

	@Column(name = ActivityReviewTableConstants.COLUMN_HOST_COMMENT)
	private String hostComment;

	@Column(name = ActivityReviewTableConstants.COLUMN_HOST_COMMENT_CREATED_AT)
	private LocalDateTime hostCommentCreatedAt = LocalDateTime.now();

	@Column(name = ActivityReviewTableConstants.COLUMN_REVIEWER_ID, nullable = false)
	private Long reviewerId;

	@Column(name = ActivityReviewTableConstants.COLUMN_ACTIVITY_ID, nullable = false)
	private Long activityId;

	@Builder
	public ActivityReviewEntity(LocalDateTime createdAt,
		int rate,
		String content,
		String hostComment,
		LocalDateTime hostCommentCreatedAt,
		Long reviewerId,
		Long activityId) {
		this.createdAt = createdAt;
		this.rate = rate;
		this.content = content;
		this.hostComment = hostComment;
		this.hostCommentCreatedAt = hostCommentCreatedAt;
		this.reviewerId = reviewerId;
		this.activityId = activityId;
	}
}
