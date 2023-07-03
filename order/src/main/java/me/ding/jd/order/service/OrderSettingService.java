package me.ding.jd.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ding.common.utils.PageUtils;
import me.ding.jd.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 17:17:54
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

