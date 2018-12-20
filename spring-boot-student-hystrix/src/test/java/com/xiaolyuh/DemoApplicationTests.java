package com.xiaolyuh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Liuxd on 2018-12-20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void TestSet() {
        stringRedisTemplate.opsForValue().set("IKey", "123");

        String str = stringRedisTemplate.opsForValue().get("IKey");

        System.out.println(str);
    }

}
