package Server.Server.domain.stay.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = StayFileTableConstants.TABLE_STAY_FILE)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StayFileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = StayFileTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = StayFileTableConstants.COLUMN_ORDER, nullable = false)
	private int order;

	@Column(name = StayFileTableConstants.COLUMN_URL, nullable = false)
	private String url;

	@JoinColumn(name = StayFileTableConstants.COLUMN_STAY_ID, nullable = false)
	private Long stayId;

	@Builder
	public StayFileEntity(int order, String url, Long stayId) {
		this.order = order;
		this.url = url;
		this.stayId = stayId;
	}
}
