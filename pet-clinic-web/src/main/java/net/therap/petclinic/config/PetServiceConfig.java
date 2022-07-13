package net.therap.petclinic.config;

import net.therap.petclinic.model.DataSourceModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author khandaker.maruf
 * @since 7/12/22
 */
@Configuration
@EnableConfigurationProperties(DataSourceModel.class)
public class PetServiceConfig {

//    @Bean
//    DataSourceModel dataSourceModel(@Value("${user_name}") String userName,
//                                    @Value(("${password}")) String password) {
//        DataSourceModel dataSourceModel = new DataSourceModel();
//        dataSourceModel.setUserName(userName);
//        dataSourceModel.setPassword(password);
//
//        return dataSourceModel;
//    }
}
