package com.pig4cloud.seata.seatabizservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.pig4cloud.seata.seatabizservice.mapper")
public class SeataBizServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataBizServiceApplication.class, args);
    }
}
