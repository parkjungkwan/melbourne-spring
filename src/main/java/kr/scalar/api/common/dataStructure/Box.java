package kr.scalar.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * packageName: kr.scalar.api.common.dataStructure
 * fileName   : Box
 * author     : parkjungkwan
 * date       : 2022-05-12
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-12   parkjungkwan  최초 생성
 */
@Component @Data @Lazy
public class Box<T> {
    private ArrayList<T> list;
    // save, update, delete, findAll, findByName, findById, count, existsById, clear
    // add, set, remove, get(), X, get(i), size, X, clear

}
