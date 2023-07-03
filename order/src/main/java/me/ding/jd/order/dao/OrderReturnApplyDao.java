package me.ding.jd.order.dao;

import me.ding.jd.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 17:17:56
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
