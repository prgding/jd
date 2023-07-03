package me.ding.jd.ware.dao;

import me.ding.jd.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 17:22:37
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
