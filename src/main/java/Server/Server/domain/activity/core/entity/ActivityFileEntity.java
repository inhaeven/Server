package Server.Server.domain.activity.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = ActivityFileTableConstants.TABLE_ACTIVITY_FILE)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityFileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivityFileTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivityFileTableConstants.COLUMN_ORDER, nullable = false)
	private int order;

	@Column(name = ActivityFileTableConstants.COLUMN_URL, nullable = false)
	private String url;

	@Column(name = ActivityFileTableConstants.COLUMN_ACTIVITY_ID, nullable = false)
	private Long activityId;

	@Builder
	public ActivityFileEntity(int order, String url, Long activityId) {
		this.order = order;
		this.url = url;
		this.activityId = activityId;
	}
}
