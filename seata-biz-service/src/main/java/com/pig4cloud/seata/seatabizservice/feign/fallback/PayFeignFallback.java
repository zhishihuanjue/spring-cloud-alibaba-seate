package com.pig4cloud.seata.seatabizservice.feign.fallback;


import com.pig4cloud.seata.seatabizservice.feign.PayFeign;
import org.springframework.stereotype.Component;

@Component
public class PayFeignFallback implements PayFeign {

    @Override
    public String pay() {
        return "调用失败";
    }
}
