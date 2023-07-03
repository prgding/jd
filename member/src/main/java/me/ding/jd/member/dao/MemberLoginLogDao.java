package me.ding.jd.member.dao;

import me.ding.jd.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 16:57:58
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
