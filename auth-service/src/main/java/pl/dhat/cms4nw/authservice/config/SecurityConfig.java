package pl.dhat.cms4nw.authservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import pl.dhat.cms4nw.authservice.jwt.JwtTokenFilterConfigurer;
import pl.dhat.cms4nw.authservice.jwt.JwtTokenUtils;

@EnableWebSecurity
public class SecurityConfig extends AbstractSecurityWebApplicationInitializer {

    @Autowired
    private JwtTokenUtils jwtTokenUtils;

    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors().and()
                .csrf().disable()
                .httpBasic().and()
                .authorizeRequests()
                    .anyRequest().fullyAuthenticated().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        ;

        http.apply(new JwtTokenFilterConfigurer(jwtTokenUtils));
    }
}
