package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2019-09-21 14:20:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
