package Server.Server.domain.community.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = CommunityCommentTableConstants.TABLE_COMMUNITY_COMMENT)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommunityCommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = CommunityCommentTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = CommunityCommentTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = CommunityCommentTableConstants.COLUMN_CONTENT, nullable = false)
	private String content;

	@Column(name = CommunityCommentTableConstants.COLUMN_CREATED_AT, nullable = false)
	private LocalDateTime createdAt;

	@Column(name = CommunityCommentTableConstants.COLUMN_PROFILE_IMAGE)
	private String profileImage;

	@Column(name = CommunityCommentTableConstants.COLUMN_COMMUNITY_ID, nullable = false)
	private Long communityId;

	@Builder
	public CommunityCommentEntity(String name, String content, LocalDateTime createdAt,
		String profileImage, Long communityId) {
		this.name = name;
		this.content = content;
		this.createdAt = createdAt;
		this.profileImage = profileImage;
		this.communityId = communityId;
	}
}
