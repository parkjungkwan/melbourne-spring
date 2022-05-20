package kr.scalar.api.board.services;

import kr.scalar.api.board.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.scalar.api.board.services
 * fileName   : BoardService
 * author     : parkjungkwan
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   parkjungkwan  최초 생성
 */
public interface BoardService {
    List<Board> findAll();
    List<Board> findAll(Sort sort);
    Page<Board> findAll(Pageable pageable);

    long count();

    String delete(Board board);

    String save(Board board);

    Optional<Board> findById(String board);

    boolean existsById(String board);
}
