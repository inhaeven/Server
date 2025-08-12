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

	@Column(name = StayFileTableConstants.COLUMN_SEQUENCE, nullable = false)
	private int sequence;

	@Column(name = StayFileTableConstants.COLUMN_URL, nullable = false)
	private String url;

	@Column(name = StayFileTableConstants.COLUMN_STAY_ID, nullable = false)
	private Long stayId;

	@Builder
	public StayFileEntity(int sequence, String url, Long stayId) {
		this.sequence = sequence;
		this.url = url;
		this.stayId = stayId;
	}
}
