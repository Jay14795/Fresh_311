package data;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginData {
    private String email;
    private String password;
}

