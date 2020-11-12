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

package com.pig4cloud.seata.seatabizservice.controller;

import com.pig4cloud.seata.seatabizservice.PayService;
import com.pig4cloud.seata.seatabizservice.domain.Pay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lengleng
 * @date 2019-12-30
 */
@RestController
public class PayController {


    @Resource
    PayService payService;

    @GetMapping("/pay")
    public String order() {
        Pay pay = new Pay();
        pay.setUsername("123456");
        payService.insertSelective(pay);
        //        payService.save();
        return "success";
    }

}
