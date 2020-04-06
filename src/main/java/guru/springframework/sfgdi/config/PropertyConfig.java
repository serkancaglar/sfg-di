package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Serkan Caglar
 * 4/6/2020 10:16 PM
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.url}")
    private String url;

    @Bean
    public FakeDataSource getFakeDataSource() {
        return new FakeDataSource(username, password, url);
    }

    public static PropertySourcesPlaceholderConfigurer loadProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}