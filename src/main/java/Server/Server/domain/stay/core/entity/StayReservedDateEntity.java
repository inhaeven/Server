package Server.Server.domain.stay.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = StayReservedDateTableConstants.TABLE_STAY_RESERVED_DATE)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StayReservedDateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = StayReservedDateTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = StayReservedDateTableConstants.COLUMN_RESERVATION_ID, nullable = false)
	private Long reservationId;

	@Column(name = StayReservedDateTableConstants.COLUMN_ROOM_ID, nullable = false)
	private Long roomId;

	@Column(name = StayReservedDateTableConstants.COLUMN_RESERVED_DATE, nullable = false)
	private LocalDate reservedDate;

	@Builder
	public StayReservedDateEntity(Long reservationId, Long roomId, LocalDate reservedDate) {
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.reservedDate = reservedDate;
	}
}
