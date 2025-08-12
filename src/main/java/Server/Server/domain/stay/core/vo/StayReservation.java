package Server.Server.domain.stay.core.vo;

import Server.Server.domain.stay.core.entity.StayReservationEntity;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class StayReservation {

	private final Long id;
	private final Long guestId;
	private final Long roomId;
	private final LocalDate checkIn;
	private final LocalDate checkOut;
	private final int guestCount;
	private final LocalDateTime createdAt;

	public StayReservation(Long id, Long guestId, Long roomId, LocalDate checkIn, LocalDate checkOut,
		int guestCount, LocalDateTime createdAt) {
		this.id = id;
		this.guestId = guestId;
		this.roomId = roomId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guestCount = guestCount;
		this.createdAt = createdAt;
	}

	public static StayReservation fromEntity(StayReservationEntity entity) {
		return new StayReservation(
			entity.getId(),
			entity.getGuestId(),
			entity.getRoomId(),
			entity.getCheckIn(),
			entity.getCheckOut(),
			entity.getGuestCount(),
			entity.getCreatedAt()
		);
	}
}
