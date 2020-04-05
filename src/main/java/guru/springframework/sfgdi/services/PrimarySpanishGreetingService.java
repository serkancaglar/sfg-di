package guru.springframework.sfgdi.services;

import lombok.AllArgsConstructor;

/**
 * @author Serkan Caglar
 * 4/5/2020 8:59 PM
 */
@AllArgsConstructor
public class PrimarySpanishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
