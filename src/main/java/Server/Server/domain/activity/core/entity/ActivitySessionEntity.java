package Server.Server.domain.activity.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = ActivitySessionTableConstants.TABLE_ACTIVITY_SESSION)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivitySessionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivitySessionTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivitySessionTableConstants.COLUMN_ACTIVITY_ID, nullable = false)
	private Long activityId;

	@Column(name = ActivitySessionTableConstants.COLUMN_START_TIME, nullable = false)
	private LocalDateTime startTime;

	@Builder
	public ActivitySessionEntity(Long activityId, LocalDateTime startTime) {
		this.activityId = activityId;
		this.startTime = startTime;
	}
}
