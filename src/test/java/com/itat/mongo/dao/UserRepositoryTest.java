package com.itat.mongo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itat.ApplicationMongo;
import com.itat.mongo.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationMongo.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepo;

    @Test
    public void testTokenMappingInsert() {

        User user = new User();
        userRepo.insert(user);
    }

}
