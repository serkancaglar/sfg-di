package guru.springframework.sfgdi.examplebeans;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Serkan Caglar
 * 4/6/2020 10:42 PM
 */
@AllArgsConstructor
@Getter
public class FakeJmsSource {

    private final String username;
    private final String password;
    private final String url;
}
