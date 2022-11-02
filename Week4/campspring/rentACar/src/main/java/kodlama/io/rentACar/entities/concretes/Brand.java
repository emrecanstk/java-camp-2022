package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")   // tabloda name'i brands'e denk getiriyoruz.
@Data                   // Lombok sayesinde getters setters eklemeye gerek kalmıyor.
// Yalnızca getter'lar olsun istiyosak buraya @Getter yazıp @Data'yı silebilirdik.
@AllArgsConstructor     // tüm parametreler içeren yapıcı metot
@NoArgsConstructor      // parametresiz yapıcı metot
@Entity                 // Sınıfın bir varlık (entity) olduğu bilgisi (anotasyon)
public class Brand {
	
	@Column(name="id")    // Sütunları eşleştirdik
	private int id;
	
	@Column(name="name")  // Sütunları eşleştirdik
	private String name;
}
