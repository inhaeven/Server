package Server.Server.domain.activity.core.entity;

import Server.Server.domain.activity.core.entity.enums.ActivityType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = ActivityTableConstants.TABLE_ACTIVITY)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ActivityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ActivityTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ActivityTableConstants.COLUMN_HOST_ID, nullable = false)
	private Long hostId;

	@Column(name = ActivityTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = ActivityTableConstants.COLUMN_TYPE, nullable = false)
	private ActivityType type;

	@Column(name = ActivityTableConstants.COLUMN_ACTIVITY_DESCRIPTION, columnDefinition = "TEXT")
	private String activityDescription;

	@Column(name = ActivityTableConstants.COLUMN_HOST_DESCRIPTION, length = 500)
	private String hostDescription;

	@Column(name = ActivityTableConstants.COLUMN_MAX_PEOPLE, nullable = false)
	private int maxPeople;

	@Column(name = ActivityTableConstants.COLUMN_LOCATION, nullable = false)
	private String location;

	@Column(name = ActivityTableConstants.COLUMN_PRICE_PER_PERSON, nullable = false)
	private int pricePerPerson;

	@Column(name = ActivityTableConstants.COLUMN_DURATION_MINUTES, nullable = false)
	private int durationMinutes;

	@Column(name = ActivityTableConstants.COLUMN_IS_LIKED)
	private boolean isLiked;

	@Column(name = ActivityTableConstants.COLUMN_IS_BADAPASS)
	private boolean isBadapass;

	@Column(name = ActivityTableConstants.COLUMN_BADAPASS_DISCOUNT_RATE)
	private int badapassDiscountRate;

	@Builder
	public ActivityEntity(Long hostId, String name, ActivityType type,
		String activityDescription, String hostDescription,
		int maxPeople, String location, int pricePerPerson,
		int durationMinutes, boolean isLiked,
		boolean isBadapass, int badapassDiscountRate) {
		this.hostId = hostId;
		this.name = name;
		this.type = type;
		this.activityDescription = activityDescription;
		this.hostDescription = hostDescription;
		this.maxPeople = maxPeople;
		this.location = location;
		this.pricePerPerson = pricePerPerson;
		this.durationMinutes = durationMinutes;
		this.isLiked = isLiked;
		this.isBadapass = isBadapass;
		this.badapassDiscountRate = badapassDiscountRate;
	}
}
