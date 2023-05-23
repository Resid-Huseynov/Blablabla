package com.example.Blablabla;


import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Commandline implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(new BCryptPasswordEncoder().encode("password"));
    }
}
