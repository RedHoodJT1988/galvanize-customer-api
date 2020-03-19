package com.galvanize;

import com.galvanize.entities.CustomerService;
import com.galvanize.repositories.CustomerServiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.io.File;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerServiceControllerTest {
    @Autowired
    CustomerServiceDao customerServiceDao;

    @Test
    @Transactional
    void count() {
        Long count = customerServiceDao.count();
        assertEquals(2L, count);
    }
}
