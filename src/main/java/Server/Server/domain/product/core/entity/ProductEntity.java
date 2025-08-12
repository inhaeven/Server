package Server.Server.domain.product.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = ProductTableConstants.TABLE_PRODUCT)
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ProductTableConstants.COLUMN_ID)
	private Long id;

	@Column(name = ProductTableConstants.COLUMN_NAME, nullable = false)
	private String name;

	@Column(name = ProductTableConstants.COLUMN_DISCOUNT, nullable = false)
	private int discount;

	@Column(name = ProductTableConstants.COLUMN_PRICE, nullable = false)
	private int price;

	@Column(name = ProductTableConstants.COLUMN_LOCATION)
	private String location;

	@Column(name = ProductTableConstants.COLUMN_DELIVERY)
	private String delivery;

	@Column(name = ProductTableConstants.COLUMN_PHOTO)
	private String photo;

	@Builder
	public ProductEntity(String name, int discount, int price, String location, String delivery, String photo) {
		this.name = name;
		this.discount = discount;
		this.price = price;
		this.location = location;
		this.delivery = delivery;
		this.photo = photo;
	}
}
