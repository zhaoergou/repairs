package com.demo.repairs.mapper;

import com.demo.repairs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-22 15:48:49
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}


