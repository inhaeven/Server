package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.StayEntity;
import Server.Server.domain.stay.core.entity.enums.StayType;
import lombok.Getter;

@Getter
public class Stay {

	private final Long id;
	private final String name;
	private final String location;
	private final String content;
	private final int price;
	private final Long hostId;
	private final boolean isLiked;
	private final boolean isBadapass;
	private final int badapassDiscountRate;
	private final StayType type;

	public Stay(
		Long id,
		String name,
		String location,
		String content,
		int price,
		Long hostId,
		boolean isLiked,
		boolean isBadapass,
		int badapassDiscountRate,
		StayType type
	) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.content = content;
		this.price = price;
		this.hostId = hostId;
		this.isLiked = isLiked;
		this.isBadapass = isBadapass;
		this.badapassDiscountRate = badapassDiscountRate;
		this.type = type;
	}

	public static Stay fromEntity(StayEntity stayEntity) {
		return new Stay(
			stayEntity.getId(),
			stayEntity.getName(),
			stayEntity.getLocation(),
			stayEntity.getContent(),
			stayEntity.getPrice(),
			stayEntity.getHostId(),
			stayEntity.isLiked(),
			stayEntity.isBadapass(),
			stayEntity.getBadapassDiscountRate(),
			stayEntity.getType()
		);
	}
}
