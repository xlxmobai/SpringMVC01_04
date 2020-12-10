package com.dao;

import com.domain.Item;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao {

    @Select("select * from items where id = #{id}")
    Item findById(Integer id);
}
