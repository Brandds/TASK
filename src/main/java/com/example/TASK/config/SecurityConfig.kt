package com.example.TASK.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@Profile("dev")
public class SecurityConfig {

    private final config.fun securityFilterChain;

   @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http.invoke {
            // Autoriza todas as requisições, por enquanto (simplificado para debug)
            authorizeHttpRequests {
                authorize(anyRequest, permitAll)
            }
            csrf {
                ignoringRequestMatchers("/h2-console/**")
            }

            headers {
                frameOptions {
                    sameOrigin = true 
            }
        }
        return http.build()
    }
}
}
