package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.StayFileEntity;
import lombok.Getter;

@Getter
public class StayFile {

	private final Long id;
	private final int order;
	private final String url;
	private final Long stayId;

	public StayFile(Long id, int order, String url, Long stayId) {
		this.id = id;
		this.order = order;
		this.url = url;
		this.stayId = stayId;
	}

	public static StayFile fromEntity(StayFileEntity entity) {
		return new StayFile(
			entity.getId(),
			entity.getOrder(),
			entity.getUrl(),
			entity.getStayId()
		);
	}
}
