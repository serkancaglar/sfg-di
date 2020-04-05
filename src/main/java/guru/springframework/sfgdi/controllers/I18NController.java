package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Serkan Caglar
 * 3/29/2020 1:01 PM
 */
@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18NGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
