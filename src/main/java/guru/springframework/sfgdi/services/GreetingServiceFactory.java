package guru.springframework.sfgdi.services;

import lombok.AllArgsConstructor;

/**
 * @author Serkan Caglar
 * 4/5/2020 8:51 PM
 */
@AllArgsConstructor
public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingService getGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
