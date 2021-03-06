package guru.springframework.sfgdi.services;

import lombok.AllArgsConstructor;

/**
 * @author Serkan Caglar
 * 3/29/2020 12:47 PM
 */
@AllArgsConstructor
public class PrimaryGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
