package guru.springframework.sfgdi.services;

import lombok.AllArgsConstructor;

/**
 * @author Serkan Caglar
 * 4/5/2020 9:00 PM
 */
@AllArgsConstructor
public class PrimaryGermanGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
