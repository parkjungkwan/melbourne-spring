package kr.scalar.api.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: kr.scalar.api.security.domains
 * fileName   : Messenger
 * author     : parkjungkwan
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23   parkjungkwan  최초 생성
 */
@Getter @Builder
public class Messenger {
    private String message, code, token;
}
