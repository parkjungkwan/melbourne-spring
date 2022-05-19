package kr.scalar.api.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName: kr.scalar.api.board.domains
 * fileName   : Article
 * author     : parkjungkwan
 * date       : 2022-05-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   parkjungkwan  최초 생성
 */
//@Component
//@Entity
//@Data
public class Article2 {
//    @Id Long id;
    private String projects;
    private String startDate;
    private String status;
    private String team;
    private String progress;
    private String action;
}
