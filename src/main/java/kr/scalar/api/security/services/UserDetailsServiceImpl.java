package kr.scalar.api.security.services;

import kr.scalar.api.auth.domains.User;
import kr.scalar.api.auth.repositories.UserRepository;
import kr.scalar.api.security.domains.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(repository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException(username+" 에 해당하는 객체가 존재하지 않습니다."));
        return UserDetailsImpl.build(user.get());
    }
}
