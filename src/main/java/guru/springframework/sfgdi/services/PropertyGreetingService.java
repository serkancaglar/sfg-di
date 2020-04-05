package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Serkan Caglar
 * 3/29/2020 12:26 PM
 */
@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Property Greeting";
    }
}
