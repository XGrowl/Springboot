package com.itheime.yaml;

import com.itheime.model.family;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomYamlTest {
    @Autowired
    com.itheime.model.family family;
    @Test
    public void hello()
    {
        System.out.println(family.toString());
    }
}
