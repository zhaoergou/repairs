package com.demo.repairs.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.EqualsAndHashCode;
import lombok.Data;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2022-11-22 15:51:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends Model<User> {
    //主键
    private Integer id;
    //姓名
    private String name;
}


