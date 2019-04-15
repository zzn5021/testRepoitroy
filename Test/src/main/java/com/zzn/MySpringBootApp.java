package com.zzn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzn.mapper") //扫描mapper
public class MySpringBootApp {
  public static void main(String[] args) {
    SpringApplication.run(MySpringBootApp.class, args);
  }
}
