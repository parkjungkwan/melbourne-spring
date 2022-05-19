package kr.scalar.api.board.services;

import kr.scalar.api.board.domains.Article2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.scalar.api.board.services
 * fileName   : ArticleService
 * author     : parkjungkwan
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   parkjungkwan  최초 생성
 */
public interface ArticleService {
    List<Article2> findAll();
    List<Article2> findAll(Sort sort);
    Page<Article2> findAll(Pageable pageable);
    long count();
    String delete(Article2 user);
    String save(Article2 user);
}
