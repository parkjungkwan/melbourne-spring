package kr.scalar.api.soccer.repositories;
import kr.scalar.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * packageName   :   com.toomuchcoder.api.soccer.repositories
 * fileName      :   PlayerRepository
 * author        :   JeongmyeongHong
 * date          :   2022-05-09
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-05-09      JeongmyoengHong     최초 생성
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}