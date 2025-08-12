package Server.Server.domain.community.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = CommunityTableConstants.TABLE_COMMUNITY)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommunityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = CommunityTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = CommunityTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = CommunityTableConstants.COLUMN_TITLE, nullable = false)
	private String title;

	@Column(name = CommunityTableConstants.COLUMN_CONTENT, nullable = false)
	private String content;

	@Column(name = CommunityTableConstants.COLUMN_CREATED_AT, nullable = false)
	private LocalDateTime createdAt;

	@Column(name = CommunityTableConstants.COLUMN_LIKE_COUNT, nullable = false)
	private int likeCount;

	@Column(name = CommunityTableConstants.COLUMN_COMMENT_COUNT, nullable = false)
	private int commentCount;

	@Column(name = CommunityTableConstants.COLUMN_IS_LIKED, nullable = false)
	private boolean isLiked;

	@Column(name = CommunityTableConstants.COLUMN_URL)
	private String url;

	@Builder
	public CommunityEntity(String name, String title, String content, LocalDateTime createdAt,
		int likeCount, int commentCount, boolean isLiked, String url) {
		this.name = name;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.likeCount = likeCount;
		this.commentCount = commentCount;
		this.isLiked = isLiked;
		this.url = url;
	}
}
