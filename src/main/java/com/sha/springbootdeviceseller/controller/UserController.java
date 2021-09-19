package com.sha.springbootdeviceseller.controller;

import com.sha.springbootdeviceseller.model.Role;
import com.sha.springbootdeviceseller.security.UserPrincipal;
import com.sha.springbootdeviceseller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sa
 * @date 19.09.2021
 * @time 17:17
 */
@RestController
@RequestMapping("api/user")//pre-path
public class UserController
{
    @Autowired
    private UserService userService;

    @PutMapping("change/{role}")//api/user/change/{role}
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role)
    {
        userService.changeRole(role, userPrincipal.getUsername());

        return ResponseEntity.ok(true);
    }
}
