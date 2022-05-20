package kr.scalar.api.auth.repositories;

import kr.scalar.api.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
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

interface UserCustomRepository{
    // 000. 사용자의 비밀번호와 이메일을 수정하시오
    @Modifying
    @Query(value = "")
    void update(User user);

    @Query(value = "")
    String login(User user);
}

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
