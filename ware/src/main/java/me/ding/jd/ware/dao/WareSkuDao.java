package me.ding.jd.ware.dao;

import me.ding.jd.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 17:22:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
