package net.therap.petclinic.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

/**
 * @author khandaker.maruf
 * @since 7/12/22
 */
@ConstructorBinding
@ConfigurationProperties("guru")
public class DataSourceModel {

    private final String userName;
    private final String password;

    public DataSourceModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
