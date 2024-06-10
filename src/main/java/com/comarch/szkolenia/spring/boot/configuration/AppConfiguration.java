package com.comarch.szkolenia.spring.boot.configuration;

import com.comarch.szkolenia.spring.boot.library.X;
import com.comarch.szkolenia.spring.boot.repository.IUserRepository;
import com.comarch.szkolenia.spring.boot.repository.UserRepository;
import com.comarch.szkolenia.spring.boot.service.IUserService;
import com.comarch.szkolenia.spring.boot.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {
        "com.comarch.szkolenia.spring.boot.controllers",
        "com.comarch.szkolenia.spring.boot.repository",
        "com.comarch.szkolenia.spring.boot.service"
})
//@ImportResource("classpath:/plik.xml")
@EnableAutoConfiguration
public class AppConfiguration {

    @Bean
    public X xComponent() {
        return new X();
    }

    @Bean
    public IUserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public IUserService userService(IUserRepository userRepository) {
        return new UserService(userRepository);
    }
}
