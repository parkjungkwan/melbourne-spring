package net.zerotodev.api.repositories;

import net.zerotodev.api.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: net.zerotodev.api.repositories
 * fileName   : UserRepository
 * author     : parkjungkwan
 * date       : 2022-05-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-03   parkjungkwan  최초 생성
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void put(User user);

    String login(User user);
}
