package Server.Server.domain.stay.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = StayReservationTableConstants.TABLE_STAY_RESERVATION)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StayReservationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = StayReservationTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = StayReservationTableConstants.COLUMN_GUEST_ID, nullable = false)
	private Long guestId;

	@Column(name = StayReservationTableConstants.COLUMN_ROOM_ID, nullable = false)
	private Long roomId;

	@Column(name = StayReservationTableConstants.COLUMN_CHECK_IN, nullable = false)
	private LocalDate checkIn;

	@Column(name = StayReservationTableConstants.COLUMN_CHECK_OUT, nullable = false)
	private LocalDate checkOut;

	@Column(name = StayReservationTableConstants.COLUMN_GUEST_COUNT, nullable = false)
	private int guestCount;

	@Column(name = StayReservationTableConstants.COLUMN_CREATED_AT, nullable = false)
	private LocalDateTime createdAt = LocalDateTime.now();

	@Builder
	public StayReservationEntity(Long guestId, Long roomId, LocalDate checkIn, LocalDate checkOut,
		int guestCount, LocalDateTime createdAt) {
		this.guestId = guestId;
		this.roomId = roomId;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.guestCount = guestCount;
		this.createdAt = createdAt;
	}
}
