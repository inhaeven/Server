package Server.Server.domain.stay.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = RoomTableConstants.TABLE_ROOM)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = RoomTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = RoomTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = RoomTableConstants.COLUMN_OPTIONS)
	private String options;

	@Column(name = RoomTableConstants.COLUMN_MAX_PEOPLE, nullable = false)
	private int maxPeople;

	@Column(name = RoomTableConstants.COLUMN_BEDS, nullable = false)
	private int beds;

	@Column(name = RoomTableConstants.COLUMN_INNER_ROOMS, nullable = false)
	private int innerRooms;

	@Column(name = RoomTableConstants.COLUMN_IMAGE)
	private String image;

	@JoinColumn(name = RoomTableConstants.COLUMN_STAY_ID, nullable = false)
	private Long stayId;

	@Column(name = RoomTableConstants.COLUMN_IS_ACTIVE, nullable = false)
	private boolean isActive;

	@Builder
	public RoomEntity(
		String name,
		String options,
		int maxPeople,
		int beds,
		int innerRooms,
		String image,
		Long stayId,
		boolean isActive
	) {
		this.name = name;
		this.options = options;
		this.maxPeople = maxPeople;
		this.beds = beds;
		this.innerRooms = innerRooms;
		this.image = image;
		this.stayId = stayId;
		this.isActive = isActive;
	}
}
