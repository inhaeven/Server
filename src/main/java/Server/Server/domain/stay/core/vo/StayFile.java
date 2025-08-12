package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.StayFileEntity;
import lombok.Getter;

@Getter
public class StayFile {

	private final Long id;
	private final int sequence;
	private final String url;
	private final Long stayId;

	public StayFile(Long id, int sequence, String url, Long stayId) {
		this.id = id;
		this.sequence = sequence;
		this.url = url;
		this.stayId = stayId;
	}

	public static StayFile fromEntity(StayFileEntity entity) {
		return new StayFile(
			entity.getId(),
			entity.getSequence(),
			entity.getUrl(),
			entity.getStayId()
		);
	}
}
