/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.seata.seatabizservice.service;

import com.pig4cloud.seata.seatabizservice.feign.OrderFeign;
import com.pig4cloud.seata.seatabizservice.feign.PayFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lengleng
 * @date 2019-12-30
 */
@Service
public class BizService {

    @Resource
    PayFeign payFeign;

    @Resource
    OrderFeign orderFeign;

    @GlobalTransactional
    public void biz() {
        String pay = payFeign.pay();
        String order = orderFeign.order();
        int i = 1 / 0;
    }

}
