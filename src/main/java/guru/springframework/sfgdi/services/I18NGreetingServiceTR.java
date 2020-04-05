package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Serkan Caglar
 * 3/29/2020 1:05 PM
 */
@Service("i18NGreetingService")
@Profile({"TR", "default"})
public class I18NGreetingServiceTR implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Merhaba Dünya - TR";
    }
}
