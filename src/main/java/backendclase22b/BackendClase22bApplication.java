package backendclase22b;

import backendclase22b.dao.BDH2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendClase22bApplication {

	public static void main(String[] args) {
		BDH2.cargarBD();
		SpringApplication.run(BackendClase22bApplication.class, args);
	}

}
