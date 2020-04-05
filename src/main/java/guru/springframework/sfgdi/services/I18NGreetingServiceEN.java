package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Serkan Caglar
 * 3/29/2020 1:04 PM
 */
@Service("i18NGreetingService")
@Profile("EN")
public class I18NGreetingServiceEN implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
