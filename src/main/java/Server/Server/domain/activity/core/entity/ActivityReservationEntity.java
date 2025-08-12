package Server.Server.domain.activity.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = ActivityReservationTableConstants.TABLE_ACTIVITY_RESERVATION)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityReservationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivityReservationTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivityReservationTableConstants.COLUMN_GUEST_ID, nullable = false)
	private Long guestId;

	@Column(name = ActivityReservationTableConstants.COLUMN_ACTIVITY_SESSION_ID, nullable = false)
	private Long activitySessionId;

	@Column(name = ActivityReservationTableConstants.COLUMN_GUEST_COUNT, nullable = false)
	private int guestCount;

	@Column(name = ActivityReservationTableConstants.COLUMN_CREATED_AT, nullable = false)
	private LocalDateTime createdAt;

	@Builder
	public ActivityReservationEntity(Long guestId, Long activitySessionId, int guestCount, LocalDateTime createdAt) {
		this.guestId = guestId;
		this.activitySessionId = activitySessionId;
		this.guestCount = guestCount;
		this.createdAt = createdAt;
	}
}
