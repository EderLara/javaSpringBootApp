// package com.pruebas.config;

// // SecurityConfig.java
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.config.Customizer;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .csrf(csrf -> csrf.disable())
//                 .authorizeHttpRequests(requests -> requests
//                         //.requestMatchers("/api/v1/usuarios/registrar", "/api/v1/usuarios/login", "/api/v1/usuarios/", "/api/v1/usuarios/tipousuarios").permitAll() // Permite el acceso sin autenticación a "/api/v1/usuarios/registrar", "/api/v1/usuarios/login", "/api/v1/usuarios/", "/api/v1/usuarios/tipousuarios/"
//                         .anyRequest().authenticated()
//                         );
//                        // .httpBasic(Customizer.withDefaults());
//         return http.build();
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
// }