package kr.scalar.api.user.services;

import kr.scalar.api.domains.Messenger;
import kr.scalar.api.user.domains.User;
import kr.scalar.api.user.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: net.zerotodev.api.services
 * fileName   : UserService
 * author     : parkjungkwan
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   parkjungkwan  최초 생성
 */

public interface UserService {

    UserDTO login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    Messenger count();

    Messenger update(User user);

    Messenger delete(User user);

    Messenger save(User user);

    Optional<User> findById(String userid);

    Messenger existsById(String userid);

    // custom

    List<User> findByUserName(String name);


    Messenger logout();
}
