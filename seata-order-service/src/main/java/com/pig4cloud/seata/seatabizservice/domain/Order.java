package com.pig4cloud.seata.seatabizservice.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * @Author：yangji
 * @Date: 2020/11/12 11:59 
 * @Description:
 */
@Data
@Table(name = "`order`")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "username")
    private String username;
}