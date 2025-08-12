package Server.Server.domain.activity.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = ActivityReservedDateTableConstants.TABLE_ACTIVITY_RESERVED_DATE)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityReservedDateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivityReservedDateTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivityReservedDateTableConstants.COLUMN_RESERVATION_ID, nullable = false)
	private Long reservationId;

	@Column(name = ActivityReservedDateTableConstants.COLUMN_ACTIVITY_ID, nullable = false)
	private Long activityId;

	@Column(name = ActivityReservedDateTableConstants.COLUMN_RESERVED_DATE, nullable = false)
	private LocalDate reservedDate;

	@Builder
	public ActivityReservedDateEntity(Long reservationId, Long activityId, LocalDate reservedDate) {
		this.reservationId = reservationId;
		this.activityId = activityId;
		this.reservedDate = reservedDate;
	}
}
