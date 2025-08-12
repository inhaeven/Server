package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.StayReviewFileEntity;
import lombok.Getter;

@Getter
public class StayReviewFile {

	private final Long id;
	private final int sequence;
	private final String url;
	private final Long stayReviewId;

	public StayReviewFile(Long id, int sequence, String url, Long stayReviewId) {
		this.id = id;
		this.sequence = sequence;
		this.url = url;
		this.stayReviewId = stayReviewId;
	}

	public static StayReviewFile fromEntity(StayReviewFileEntity entity) {
		return new StayReviewFile(
			entity.getId(),
			entity.getSequence(),
			entity.getUrl(),
			entity.getStayReviewId()
		);
	}
}
