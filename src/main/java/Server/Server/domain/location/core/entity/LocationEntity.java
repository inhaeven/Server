package Server.Server.domain.location.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = LocationTableConstants.TABLE_LOCATION)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LocationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = LocationTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = LocationTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = LocationTableConstants.COLUMN_ADDRESS, nullable = false)
	private String address;

	@Builder
	public LocationEntity(String name, String address) {
		this.name = name;
		this.address = address;
	}
}
