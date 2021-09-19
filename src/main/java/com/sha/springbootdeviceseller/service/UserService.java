package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.model.User;

import java.util.Optional;

/**
 * @author sa
 * @date 18.09.2021
 * @time 18:17
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
