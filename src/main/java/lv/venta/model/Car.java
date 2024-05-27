package lv.venta.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
	
	//@Max(10)
	@Column(name = "model")
	@NotNull
	//@Pattern(regexp = "[A-Za-z0-9]")
	private String model;
	
	@Column(name = "carNumber")
	@NotNull
	@Pattern(regexp = "[A-Z]{2}[0-9]{4}")
	private String carNumber;
	
	@Column(name = "carType")
	@NotNull
	private CarType type;
	
	
	@OneToOne(mappedBy = "car") //vienai masinai viena dala
	@ToString.Exclude //kad ieklauj otras klases objektu, lai nav cirkulara saite
	private Parts part; 
	
	
	public Car(CarBrand brand, String model, String carNumber, CarType type, Parts part) {
		setBrand(brand);
		setModel(model);
		setCarNumber(carNumber);
		setType(type);
		setPart(part);
		
	}
	
	
}
