package JotunbaneLab.WarehouseApp;

import JotunbaneLab.WarehouseApp.configuration.SpringConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class WarehouseAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting App");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);




	}

}
