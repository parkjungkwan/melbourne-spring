package kr.scalar.api.security.domains;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * packageName: kr.scalar.api.security.domains
 * fileName   : UserDetailsServiceImpl
 * author     : parkjungkwan
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23   parkjungkwan  최초 생성
 */
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
