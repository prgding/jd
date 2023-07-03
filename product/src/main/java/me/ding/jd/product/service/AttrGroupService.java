package me.ding.jd.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ding.common.utils.PageUtils;
import me.ding.jd.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author dingshuai
 * @email 1203823603@qq.com
 * @date 2023-06-29 15:19:17
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

