package me.ding.jd.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.ding.common.utils.PageUtils;
import me.ding.jd.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author dingshuai
 * @email dingshuai3603@gmail.com
 * @date 2023-07-03 16:57:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

