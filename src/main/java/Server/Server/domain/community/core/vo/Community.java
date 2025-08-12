package Server.Server.domain.community.core.vo;

import Server.Server.domain.community.core.entity.CommunityEntity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Community {

	private final Long id;
	private final String name;
	private final String title;
	private final String content;
	private final LocalDateTime createdAt;
	private final int likeCount;
	private final int commentCount;
	private final boolean isLiked;
	private final String url;

	public Community(Long id, String name, String title, String content,
		LocalDateTime createdAt, int likeCount, int commentCount,
		boolean isLiked, String url) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.likeCount = likeCount;
		this.commentCount = commentCount;
		this.isLiked = isLiked;
		this.url = url;
	}

	public static Community fromEntity(CommunityEntity entity) {
		return new Community(
			entity.getId(),
			entity.getName(),
			entity.getTitle(),
			entity.getContent(),
			entity.getCreatedAt(),
			entity.getLikeCount(),
			entity.getCommentCount(),
			entity.isLiked(),
			entity.getUrl()
		);
	}
}
