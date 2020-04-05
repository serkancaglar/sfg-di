package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Serkan Caglar
 * 3/28/2020 11:30 PM
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Constructor Greeting";
    }
}
