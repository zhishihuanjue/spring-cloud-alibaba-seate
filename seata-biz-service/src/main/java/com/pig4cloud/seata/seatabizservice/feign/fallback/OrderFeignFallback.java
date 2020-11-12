package com.pig4cloud.seata.seatabizservice.feign.fallback;


import com.pig4cloud.seata.seatabizservice.feign.OrderFeign;
import org.springframework.stereotype.Component;

@Component
public class OrderFeignFallback implements OrderFeign {

    @Override
    public String order() {
        return "调用失败";
    }
}
