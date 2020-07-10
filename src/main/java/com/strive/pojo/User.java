package com.strive.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户名称
    */
    private String username;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 地址
    */
    private String address;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 0未启用,1启用
    */
    private Integer status;

    /**
    * 0删除,1存在
    */
    private Integer isDel;

}