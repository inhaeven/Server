package Server.Server.domain.community.core.vo;

import Server.Server.domain.community.core.entity.CommunityCommentEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommunityComment {

	private final Long id;
	private final String name;
	private final String content;
	private final LocalDateTime createdAt;
	private final String profileImage;
	private final Long communityId;

	public CommunityComment(Long id, String name, String content,
		LocalDateTime createdAt, String profileImage, Long communityId) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.createdAt = createdAt;
		this.profileImage = profileImage;
		this.communityId = communityId;
	}

	public static CommunityComment fromEntity(CommunityCommentEntity entity) {
		return new CommunityComment(
			entity.getId(),
			entity.getName(),
			entity.getContent(),
			entity.getCreatedAt(),
			entity.getProfileImage(),
			entity.getCommunityId()
		);
	}
}
