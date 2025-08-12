package Server.Server.domain.stay.core.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = StayReviewTableConstants.TABLE_STAY_REVIEW)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StayReviewEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = StayReviewTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = StayReviewTableConstants.COLUMN_REVIEWER_ID, nullable = false)
	private Long reviewerId;

	@Column(name = StayReviewTableConstants.COLUMN_STAY_ID, nullable = false)
	private Long stayId;

	@Column(name = StayReviewTableConstants.COLUMN_CREATED_AT, nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@Column(name = StayReviewTableConstants.COLUMN_RATE, nullable = false)
	private int rate;

	@Column(name = StayReviewTableConstants.COLUMN_CONTENT, columnDefinition = "TEXT")
	private String content;

	@Column(name = StayReviewTableConstants.COLUMN_HOST_COMMENT)
	private String hostComment;

	@Column(name = StayReviewTableConstants.COLUMN_HOST_COMMENT_CREATED_AT)
	private LocalDateTime hostCommentCreatedAt = LocalDateTime.now();

	@Builder
	public StayReviewEntity(Long reviewerId, Long stayId, LocalDateTime createdAt,
		int rate, String content, String hostComment,
		LocalDateTime hostCommentCreatedAt) {
		this.reviewerId = reviewerId;
		this.stayId = stayId;
		this.createdAt = createdAt;
		this.rate = rate;
		this.content = content;
		this.hostComment = hostComment;
		this.hostCommentCreatedAt = hostCommentCreatedAt;
	}
}
