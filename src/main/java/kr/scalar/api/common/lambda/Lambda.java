package kr.scalar.api.common.lambda;

import static kr.scalar.api.common.dataStructure.AppleList.Apple;
import static kr.scalar.api.common.dataStructure.AppleList.Apple.Builder;
import java.util.function.Function;

/**
 * packageName: kr.scalar.api.common.lambda
 * fileName   : LambdaUtil
 * author     : parkjungkwan
 * date       : 2022-05-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-11   parkjungkwan  최초 생성
 */
public class Lambda {
    public static void main(String[] args) {
        // System.out.println(integer("900"));
        System.out.println(new Apple.Builder().origin("영동").color("RED").price(3000).build());

    }
    public static int integer(String s){
        // Integer i = Integer.parseInt("900");
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(s);
    }
    public static String string(Object o){
        // String s = String.valueOf(Object);
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
    }
}
