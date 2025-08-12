package Server.Server.domain.banner.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = BannerTableConstants.TABLE_BANNER)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BannerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = BannerTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = BannerTableConstants.COLUMN_COVER, nullable = false)
	private String cover;              // 배너 커버 이미지 URL

	@Column(name = BannerTableConstants.COLUMN_SEQUENCE, nullable = false)
	private int sequence;                 // 노출 순서

	@Column(name = BannerTableConstants.COLUMN_LINKED_URL)
	private String linkedUrl;          // 클릭 시 이동 URL (optional)

	@Builder
	public BannerEntity(String cover, int sequence, String linkedUrl) {
		this.cover = cover;
		this.sequence = sequence;
		this.linkedUrl = linkedUrl;
	}
}
