package limengrd;

import limengrd.bean.Person;
import limengrd.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
   // @Test
    public void test(){
        //配置方法
       //ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("classpath:beans.xml");
       //注解方式
       ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for(String str:beanNames){
            System.out.println(str);
        }
    }

    @Test
    public void testscan(){
        ApplicationContext applicationContext =   new AnnotationConfigApplicationContext(MainConfig.class);
        String [] names =applicationContext.getBeanDefinitionNames();
        for (String str: names) {
            System.out.println(str);
        }
    }
}
