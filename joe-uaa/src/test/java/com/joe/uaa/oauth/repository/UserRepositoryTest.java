package com.joe.uaa.oauth.repository;

import com.joe.uaa.oauth.domain.User;
import com.joe.uaa.oauth.domain.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @Test
//    @Rollback(value = false)
//    public void findByUsername() {
//        Role role = new Role();
//        role.setName("ROLE_ADMIN");
//        List<Role> roleList = new ArrayList<>();
//        roleList.addAll(roleList);
//        User user = new User();
//        user.setUsername("joe");
//        user.setPassword(passwordEncoder().encode("123456"));
//        user.setRoles(roleList);
//        userRepository.save(user);
//    }

    @Test
    public void test(){
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
    }
}