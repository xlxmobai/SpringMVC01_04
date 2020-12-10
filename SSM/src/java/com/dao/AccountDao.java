package com.dao;

import com.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
