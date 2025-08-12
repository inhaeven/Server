package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.StayReservedDateEntity;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class StayReservedDate {

	private final Long id;
	private final Long reservationId;
	private final Long roomId;
	private final LocalDate reservedDate;

	public StayReservedDate(Long id, Long reservationId, Long roomId, LocalDate reservedDate) {
		this.id = id;
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.reservedDate = reservedDate;
	}

	public static StayReservedDate fromEntity(StayReservedDateEntity entity) {
		return new StayReservedDate(
			entity.getId(),
			entity.getReservationId(),
			entity.getRoomId(),
			entity.getReservedDate()
		);
	}
}
