package hei.tp03.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

/**
 * Created by audrey on 17/01/2017.
 */
@Configuration
@ComponentScan(basePackages = "hei.tp03.service")
public class AppConfig {


    @Bean
    public Properties dbProperties() {
        Properties dbProperties = new Properties();
        //properties fonctionne sous forme de clé-valeur
        dbProperties.setProperty("driverClass", "com.mysql.jdbc.Driver");
        dbProperties.setProperty("jdbcUrl", "jdbc:mysql://localhost:3306/hei_tp03");
        dbProperties.setProperty("username", "root");
        dbProperties.setProperty("password", "");
        return dbProperties;
    }
}
