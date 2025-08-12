package Server.Server.domain.banner.core.vo;

import Server.Server.domain.banner.core.entity.BannerEntity;
import lombok.Getter;

@Getter
public class Banner {

	private final Long id;
	private final String cover;
	private final int sequence;
	private final String linkedUrl;

	public Banner(Long id, String cover, int sequence, String linkedUrl) {
		this.id = id;
		this.cover = cover;
		this.sequence = sequence;
		this.linkedUrl = linkedUrl;
	}

	public static Banner fromEntity(BannerEntity entity) {
		return new Banner(
			entity.getId(),
			entity.getCover(),
			entity.getSequence(),
			entity.getLinkedUrl()
		);
	}
}
