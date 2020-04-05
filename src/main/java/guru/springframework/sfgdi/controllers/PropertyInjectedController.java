package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Serkan Caglar
 * 3/28/2020 11:31 PM
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public @Qualifier("propertyGreetingService") GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
