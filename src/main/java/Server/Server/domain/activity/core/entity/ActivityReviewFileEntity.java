package Server.Server.domain.activity.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = ActivityReviewFileTableConstants.TABLE_ACTIVITY_REVIEW_FILE)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityReviewFileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivityReviewFileTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivityReviewFileTableConstants.COLUMN_SEQUENCE, nullable = false)
	private int sequence;

	@Column(name = ActivityReviewFileTableConstants.COLUMN_URL, nullable = false)
	private String url;

	@Column(name = ActivityReviewFileTableConstants.COLUMN_ACTIVITY_REVIEW_ID, nullable = false)
	private Long activityReviewId;

	@Builder
	public ActivityReviewFileEntity(int sequence, String url, Long activityReviewId) {
		this.sequence = sequence;
		this.url = url;
		this.activityReviewId = activityReviewId;
	}
}
