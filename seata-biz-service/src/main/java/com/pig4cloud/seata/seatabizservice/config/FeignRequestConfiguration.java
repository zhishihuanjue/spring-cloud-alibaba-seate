package com.pig4cloud.seata.seatabizservice.config;


import com.pig4cloud.seata.seatabizservice.interceptor.FeignRequestInterceptor;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：yangji
 * @Date: 2020/3/16 20:48
 * @Description: Feign 全局配置
 */
@Configuration
public class FeignRequestConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignRequestInterceptor();
    }

}
