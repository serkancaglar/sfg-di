package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Serkan Caglar
 * 3/29/2020 12:41 PM
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Setter Greeting";
    }
}