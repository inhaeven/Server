package Server.Server.domain.location.core.vo;

import java.io.Serializable;

import Server.Server.domain.location.core.entity.LocationEntity;
import lombok.Getter;

@Getter
public class Location implements Serializable {
	private final Long id;
	private final String name;
	private final String address;

	public Location(Long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static Location fromEntity(LocationEntity entity) {
		return new Location(
			entity.getId(),
			entity.getName(),
			entity.getAddress()
		);
	}
}
