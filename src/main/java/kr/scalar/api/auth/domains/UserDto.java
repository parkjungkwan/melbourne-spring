package kr.scalar.api.auth.domains;

import lombok.Data;
import org.springframework.stereotype.Component;


/**
 * packageName: kr.scalar.api.auth.domains
 * fileName   : UserDto
 * author     : parkjungkwan
 * date       : 2022-05-24
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-24   parkjungkwan  최초 생성
 */
@Component @Data
public class UserDto {
    @ApiModelProperty() private long userId;
}
