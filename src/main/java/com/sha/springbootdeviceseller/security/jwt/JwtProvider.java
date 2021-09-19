package com.sha.springbootdeviceseller.security.jwt;

import com.sha.springbootdeviceseller.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sa
 * @date 19.09.2021
 * @time 16:21
 */
public interface JwtProvider
{
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
