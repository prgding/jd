package me.ding.jd.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ding.common.utils.PageUtils;
import me.ding.jd.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 17:22:37
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

