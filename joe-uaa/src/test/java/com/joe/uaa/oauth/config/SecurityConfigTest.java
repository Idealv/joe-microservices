package com.joe.uaa.oauth.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SecurityConfigTest {
    @Test
    public void test(){


        Jwt decode = JwtHelper.decode("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NzAzNDg4NzUsInVzZXJfbmFtZSI6ImpvZSIsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwianRpIjoiZDFlYzY5NGUtZjNjMC00NDAyLWFlMTQtODczOWI3MjA5OGIyIiwiY2xpZW50X2lkIjoiam9lQ2xpZW50MSIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSIsInRydXN0Il19.n6yV9dpxVO3eS-9MARb8fd514uYMvu9UjZa3wBkpvTk");
        System.out.println("decode = " + decode);
    }
}