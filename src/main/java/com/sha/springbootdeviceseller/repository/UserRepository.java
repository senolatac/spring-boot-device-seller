package com.sha.springbootdeviceseller.repository;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author sa
 * @date 18.09.2021
 * @time 18:05
 */
public interface UserRepository extends JpaRepository<User, Long>
{
    //findBy + fieldName
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
