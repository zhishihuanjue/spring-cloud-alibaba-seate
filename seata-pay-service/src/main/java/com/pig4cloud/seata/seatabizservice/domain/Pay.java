package com.pig4cloud.seata.seatabizservice.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * @Author：yangji
 * @Date: 2020/11/12 11:50 
 * @Description:
 */
@Data
@Table(name = "pay")
public class Pay {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "username")
    private String username;
}