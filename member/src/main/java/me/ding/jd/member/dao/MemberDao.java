package me.ding.jd.member.dao;

import me.ding.jd.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 16:57:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
