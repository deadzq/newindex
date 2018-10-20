package com.ykmimi.newindex.mapper;

import com.ykmimi.newindex.bean.MemberCard;

public interface MemberCardMapper {
    int deleteByPrimaryKey(Long mcardId);

    int insert(MemberCard record);

    int insertSelective(MemberCard record);

    MemberCard selectByPrimaryKey(Long mcardId);

    int updateByPrimaryKeySelective(MemberCard record);

    int updateByPrimaryKey(MemberCard record);
}