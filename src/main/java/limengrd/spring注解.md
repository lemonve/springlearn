#注解方式详解
1. 注解介绍
- @Configuration：告诉Spring是一个配置类
- @ComponentScan:包扫描注解
- @ComponentScan.Filter:过滤包扫描


    @ComponentScan(value = "limengrd",excludeFilters = {
              @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
                     Controller.class, Service.class
            })
    })

