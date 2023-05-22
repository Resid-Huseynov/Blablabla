//package com.example.Blablabla.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//        @Bean
//        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//            http.csrf(AbstractHttpConfigurer::disable);
//            http.authorizeRequests();
//            http.authorizeHttpRequests()
//            http.csrf().disable();
//
//            return http.build();
//        }
//
//        @Bean
//        public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
//
//            UserDetails elsad = User.builder()
//                    .username("Elsad")
//                    .password("{noop}quliyev")
//                    .roles("User")
//                    .build();
//
//            UserDetails elmir = User.builder()
//                    .username("Elmir")
//                    .password("{noop}abdurahimov")
//                    .roles("User", "Manager")
//                    .build();
//
//            UserDetails resid = User.builder()
//                    .username("Resid")
//                    .password("{noop}huseynov")
//                    .roles("User", "Manager", "Admin")
//                    .build();
//
//            return new InMemoryUserDetailsManager(elsad, elmir, resid);
//        }
//}
