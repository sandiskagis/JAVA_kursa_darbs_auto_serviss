package lv.venta;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import jakarta.servlet.http.Part;
import lv.venta.model.Car;
import lv.venta.model.CarBrand;
import lv.venta.model.CarType;
import lv.venta.model.Parts;
import lv.venta.repo.ICarRepo;
import lv.venta.repo.IPartsRepo;
import lv.venta.repo.IPartsRepo;

@SpringBootApplication
public class KursaDarbsAutoServissApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursaDarbsAutoServissApplication.class, args);
	}
	@Bean
	public CommandLineRunner testDatabaseLayer(ICarRepo carRepo, IPartsRepo partsRepo)
	{
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				
				Parts pa1 = new Parts(25.22f, "Bosch");
				Parts pa2 = new Parts(43.33f, "Denso");
				partsRepo.save(pa1);
				partsRepo.save(pa2);
				
				
				Car car1 = new Car(CarBrand.Audi,"A6","NA1002",CarType.sedan, pa1);// TODO Auto-generated method stub
				Car car2 = new Car(CarBrand.BMW,"e36320i","NE5555",CarType.universal, pa1);
				Car car3 = new Car(CarBrand.BMW,"e346","MM1111",CarType.universal, pa2);
				
				carRepo.save(car1);
				carRepo.save(car2);
				carRepo.save(car2);
			}
		};
}
}
