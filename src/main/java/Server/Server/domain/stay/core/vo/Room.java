package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.RoomEntity;
import lombok.Getter;

@Getter
public class Room {

	private final Long id;
	private final String name;
	private final String options;
	private final int maxPeople;
	private final int beds;
	private final int innerRooms;
	private final String image;
	private final Long stayId;
	private final boolean isActive;

	public Room(
		Long id,
		String name,
		String options,
		int maxPeople,
		int beds,
		int innerRooms,
		String image,
		Long stayId,
		boolean isActive
	) {
		this.id = id;
		this.name = name;
		this.options = options;
		this.maxPeople = maxPeople;
		this.beds = beds;
		this.innerRooms = innerRooms;
		this.image = image;
		this.stayId = stayId;
		this.isActive = isActive;
	}

	public static Room fromEntity(RoomEntity entity) {
		return new Room(
			entity.getId(),
			entity.getName(),
			entity.getOptions(),
			entity.getMaxPeople(),
			entity.getBeds(),
			entity.getInnerRooms(),
			entity.getImage(),
			entity.getStayId(),
			entity.isActive()
		);
	}
}
