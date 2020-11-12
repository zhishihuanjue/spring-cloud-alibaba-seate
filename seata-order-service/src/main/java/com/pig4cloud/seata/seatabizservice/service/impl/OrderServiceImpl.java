package com.pig4cloud.seata.seatabizservice.service.impl;
import java.util.List;
import com.pig4cloud.seata.seatabizservice.domain.Order;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pig4cloud.seata.seatabizservice.mapper.OrderMapper;
import com.pig4cloud.seata.seatabizservice.OrderService;
/**
 * @Author：yangji
 * @Date: 2020/11/12 11:59
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public int insertSelective(Order order){
		 return orderMapper.insertSelective(order);
	}




    @Resource
    private OrderMapper orderMapper;



}
