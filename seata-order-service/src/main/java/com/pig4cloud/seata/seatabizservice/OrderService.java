package com.pig4cloud.seata.seatabizservice;
import java.util.List;
import com.pig4cloud.seata.seatabizservice.domain.Order;

    /**
 * @Author：yangji
 * @Date: 2020/11/12 11:59
 * @Description:
 */
public interface OrderService{



	int insertSelective(Order order);



}
