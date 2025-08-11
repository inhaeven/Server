package Server.Server.domain.stay.core.entity;

import Server.Server.domain.stay.core.entity.enums.StayType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = StayTableConstants.TABLE_STAY)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StayEntity {

	@Id
	@Column(name = StayTableConstants.COLUMN_ID)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = StayTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = StayTableConstants.COLUMN_LOCATION, nullable = false)
	private String location;

	@Column(name = StayTableConstants.COLUMN_CONTENT, columnDefinition = "TEXT")
	private String content;

	@Column(name = StayTableConstants.COLUMN_PRICE, nullable = false)
	private int price;

	@Column(name = StayTableConstants.COLUMN_HOST_ID, nullable = false)
	private Long hostId;

	@Column(name = StayTableConstants.COLUMN_IS_LIKED)
	private boolean isLiked = false;

	@Column(name = StayTableConstants.COLUMN_IS_BADAPASS)
	private boolean isBadapass = false;

	@Column(name = StayTableConstants.COLUMN_BADAPASS_DISCOUNT_RATE)
	private int badapassDiscountRate = 0;

	@Enumerated(EnumType.STRING)
	@Column(name = StayTableConstants.COLUMN_TYPE, nullable = false)
	private StayType type;

	@Builder
	public StayEntity(String name, String location, String content, int price, Long hostId,
		boolean isLiked, boolean isBadapass, int badapassDiscountRate, StayType type) {
		this.name = name;
		this.location = location;
		this.content = content;
		this.price = price;
		this.hostId = hostId;
		this.isLiked = isLiked;
		this.isBadapass = isBadapass;
		this.badapassDiscountRate = badapassDiscountRate;
		this.type = type;
	}
}
