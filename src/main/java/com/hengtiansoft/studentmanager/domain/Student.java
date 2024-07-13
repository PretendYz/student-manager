package com.hengtiansoft.studentmanager.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/12 0:30
 * @Description:
 */
@Data
@TableName("student")
public class Student {
    @TableId
    private Long id;
    private String name;
    @TableField("pwd")
    private String password;
}
