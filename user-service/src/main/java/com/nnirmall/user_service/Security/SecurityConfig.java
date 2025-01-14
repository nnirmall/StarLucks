package com.nnirmall.user_service.Security;


import com.nnirmall.user_service.service.UserServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final UserServiceImp userDetailsService;

    public SecurityConfig(UserServiceImp userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    public void configureGlobal (AuthenticationManagerBuilder auth)
            throws Exception {
        auth.userDetailsService(auth.getDefaultUserDetailsService())
                .passwordEncoder(new BCryptPasswordEncoder());
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
