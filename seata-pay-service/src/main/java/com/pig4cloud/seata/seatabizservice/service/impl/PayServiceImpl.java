package com.pig4cloud.seata.seatabizservice.service.impl;
import com.pig4cloud.seata.seatabizservice.domain.Pay;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.pig4cloud.seata.seatabizservice.mapper.PayMapper;
import com.pig4cloud.seata.seatabizservice.PayService;
/**
 * @Author：yangji
 * @Date: 2020/11/12 11:50
 * @Description:
 */
@Service
public class PayServiceImpl implements PayService{

	@Override
	public int insertSelective(Pay pay){
		 return payMapper.insertSelective(pay);
	}

    @Resource
    private PayMapper payMapper;

}
