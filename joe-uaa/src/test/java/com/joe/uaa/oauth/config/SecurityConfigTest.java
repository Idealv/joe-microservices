package com.joe.uaa.oauth.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityConfigTest {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void test() {
        String encode = bCryptPasswordEncoder.encode("123456");
        System.out.println(encode);
    }
}