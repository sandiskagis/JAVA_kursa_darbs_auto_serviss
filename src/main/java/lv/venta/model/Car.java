package lv.venta.model;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "CarTable")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Car {

	@Column(name = "idCar")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private int idCar;
	
	@Column(name = "brand")
	@NotNull
	private CarBrand brand;
	
	@Column(name = "carNumber")
	@NotNull
	@Pattern(regexp = "[A-Z]{2}[0-9]{4}")
	private String carNumber;
	
	@Column(name = "carType")
	@NotNull
	private CarType type;
	
	@Column(name = "model")
	@NotNull
	@Pattern(regexp = "[A-Z0-9]{5}")
	private String model;
	
	@OneToMany(mappedBy = "car") //vienai masinai vairakas dalas
	@ToString.Exclude //kad ieklauj otras klases objektu, lai nav cirkulara saite
	private Collection<Part> parts; 
	
	public Car(CarBrand brand, String carNumber, CarType type, String model) {
		setBrand(brand);
		setCarNumber(carNumber);
		setType(type);
		setModel(model);
	}
	
	
}
