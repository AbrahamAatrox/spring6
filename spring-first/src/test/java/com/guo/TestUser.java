package com.guo;
import org.slf4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Source;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: GQS
 * @Date: 2023/7/5-07-05-23:25
 * @Description: com.guo
 * @Version 1.0
 */
public class TestUser {
    private Logger logger= (Logger) LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        User user=(User)context.getBean("user");

        System.out.println(user);

        user.add();

        logger.info("执行成功");
    }

    @Test
    public void testUserClassForName() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.guo.User");
        User user =(User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
