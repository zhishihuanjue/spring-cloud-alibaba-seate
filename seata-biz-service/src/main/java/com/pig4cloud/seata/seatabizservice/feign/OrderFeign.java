package com.pig4cloud.seata.seatabizservice.feign;


import com.pig4cloud.seata.seatabizservice.config.FeignRequestConfiguration;
import com.pig4cloud.seata.seatabizservice.feign.fallback.OrderFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "order-service", configuration = FeignRequestConfiguration.class, fallback = OrderFeignFallback.class)
public interface OrderFeign {

    @GetMapping("/order")
    String order();

}
