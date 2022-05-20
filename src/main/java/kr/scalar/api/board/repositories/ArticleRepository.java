package kr.scalar.api.board.repositories;

import kr.scalar.api.board.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.scalar.api.board.repositories
 * fileName   : ArticleRepository
 * author     : parkjungkwan
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   parkjungkwan  최초 생성
 */

interface ArticleCustomRepository{
    // 000. title 과 content 를 수정하시오
    Article update(Article article);
}

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
