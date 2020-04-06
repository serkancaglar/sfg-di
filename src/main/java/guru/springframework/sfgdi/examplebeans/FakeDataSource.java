package guru.springframework.sfgdi.examplebeans;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Serkan Caglar
 * 4/6/2020 10:17 PM
 */
@AllArgsConstructor
@Getter
public class FakeDataSource {

    private final String username;
    private final String password;
    private final String url;
}
