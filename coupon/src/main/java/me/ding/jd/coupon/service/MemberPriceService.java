package me.ding.jd.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ding.common.utils.PageUtils;
import me.ding.jd.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 14:35:02
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

