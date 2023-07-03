package me.ding.jd.coupon.dao;

import me.ding.jd.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 14:35:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
