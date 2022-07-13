package net.therap.petclinic;

import net.therap.petclinic.model.DataSourceModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetMvnApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PetMvnApplication.class, args);

		DataSourceModel dataSourceModel = applicationContext.getBean(DataSourceModel.class);
		System.out.println(dataSourceModel.getUserName());
		System.out.println(dataSourceModel.getPassword());
	}

}
