package com.shaqima.subject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 *
 * @Author : qi
 * @create 2025/12/14 23:27
 */

@SpringBootApplication
@ComponentScan("com.shaqima")
@MapperScan("com.shaqima.**.mapper") //想把dao的类扫描加载到spring容器中进来即让 MyBatis 自动为这些接口生成代理对象并交给 Spring 管理
public class SubjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class, args);
    }
}
