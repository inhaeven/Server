package Server.Server.domain.product.core.vo;

import Server.Server.domain.product.core.entity.ProductEntity;
import lombok.Getter;

@Getter
public class Product {

	private final Long id;
	private final String name;
	private final int discount;
	private final int price;
	private final String location;
	private final String delivery;
	private final String photo;

	public Product(Long id, String name, int discount, int price, String location, String delivery, String photo) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.price = price;
		this.location = location;
		this.delivery = delivery;
		this.photo = photo;
	}

	public static Product fromEntity(ProductEntity entity) {
		return new Product(
			entity.getId(),
			entity.getName(),
			entity.getDiscount(),
			entity.getPrice(),
			entity.getLocation(),
			entity.getDelivery(),
			entity.getPhoto()
		);
	}
}
