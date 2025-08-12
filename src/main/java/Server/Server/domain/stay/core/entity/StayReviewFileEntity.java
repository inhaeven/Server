package Server.Server.domain.stay.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = StayReviewFileTableConstants.TABLE_STAY_REVIEW_FILE)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StayReviewFileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = StayReviewFileTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = StayReviewFileTableConstants.COLUMN_SEQUENCE, nullable = false)
	private int sequence;

	@Column(name = StayReviewFileTableConstants.COLUMN_URL, nullable = false)
	private String url;

	@Column(name = StayReviewFileTableConstants.COLUMN_STAY_REVIEW_ID, nullable = false)
	private Long stayReviewId;

	@Builder
	public StayReviewFileEntity(int sequence, String url, Long stayReviewId) {
		this.sequence = sequence;
		this.url = url;
		this.stayReviewId = stayReviewId;
	}
}
