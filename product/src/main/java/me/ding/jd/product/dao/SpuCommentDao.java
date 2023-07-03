package me.ding.jd.product.dao;

import me.ding.jd.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author dingshuai
 * @email 1203823603@qq.com
 * @date 2023-06-29 15:19:15
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
