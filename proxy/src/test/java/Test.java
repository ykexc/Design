import mapper.UserMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userMapper = beanFactory.getBean("userMapper", UserMapper.class);
        String s = userMapper.selectUserInfo("123");
        System.out.println(s);
    }




}
