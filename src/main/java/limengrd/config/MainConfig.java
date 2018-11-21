package limengrd.config;

import limengrd.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//配置类==配置文件
@Configuration //告诉Spring是一个配置类
@ComponentScan(value = "limengrd",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
                Controller.class, Service.class
        })
})
//includeFilters Filter[] 包括
//excludeFilters Filter[] 不包括
public class MainConfig {
    //给容器注册一个Bean；类型为返回的类型，id默认适用方法名
    @Bean("person")
    public Person person01(){
        return  new Person("limengrd","26");
    }

}
