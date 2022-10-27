package com.tobedeveloper.jpaqueryexample.repository;

import com.tobedeveloper.jpaqueryexample.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

//    JPQL
    @Query(value = "select u from UserEntity u where u.userId=?1")
    UserEntity findUserById(Integer userId);

//    Native Query
    @Query(value = "select * from USERS_TBL where USERNAME=?1", nativeQuery = true)
    UserEntity findUserByUsername(String username);

}
