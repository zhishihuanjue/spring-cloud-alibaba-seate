package com.pig4cloud.seata.seatabizservice;
import com.pig4cloud.seata.seatabizservice.domain.Pay;
import java.util.List;

    /**
 * @Author：yangji
 * @Date: 2020/11/12 11:50
 * @Description:
 */
public interface PayService{



	int insertSelective(Pay pay);



}
