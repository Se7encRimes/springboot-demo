package com.zy.repository;

import com.zy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 13:54
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {
    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
