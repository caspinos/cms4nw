package pl.dhat.cms4nw.authservice.controller.api.v1.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.Authentication;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private Authentication authentication;
    private String jwtToken;
}
