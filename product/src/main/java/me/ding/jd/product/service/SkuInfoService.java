package me.ding.jd.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ding.common.utils.PageUtils;
import me.ding.jd.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author dingshuai
 * @email 1203823603@qq.com
 * @date 2023-06-29 15:19:16
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

