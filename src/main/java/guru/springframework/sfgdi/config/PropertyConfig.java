package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Serkan Caglar
 * 4/6/2020 10:16 PM
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.url}")
    private String dbUrl;

    @Value("${jms.username}")
    private String jmsUsername;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.url}")
    private String jmsUrl;

    @Bean
    public FakeDataSource getFakeDataSource() {
        return new FakeDataSource(dbUsername, dbPassword, dbUrl);
    }

    @Bean
    public FakeJmsSource getFakeJmsSource() {
        return new FakeJmsSource(jmsUsername, jmsPassword, jmsUrl);
    }

    public static PropertySourcesPlaceholderConfigurer loadProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}