package com.strive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    /**
    * 用户等级id
    */
    private Integer gradeId;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户积分
    */
    private Integer integral;

    /**
    * 用户等级
    */
    private String userGrade;
}