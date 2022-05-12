package kr.scalar.api.common.lambda;

import static kr.scalar.api.common.dataStructure.AppleList.Apple;

import java.io.File;
import java.util.Arrays;
import java.util.function.*;

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
/**
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(
                string(
                        Arrays.asList(
                                new Apple.Builder().origin("영동").color("RED").price(1000).build(),
                                new Apple.Builder().origin("영동").color("BLUE").price(2000).build(),
                                new Apple.Builder().origin("풍기").color("BLUE").price(3000).build()
                        ))
                );
        System.out.println(array(10).length);
 */
        System.out.println(random(1,6));

    }
    public static int integer(String s){
        int i = Integer.parseInt("900");
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(s);
    }
    public static String string(Object o){
        // String s = String.valueOf(o);
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);
    }
    public static int[] array(int a){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(a);
    }
    // int[] arr = new int[8];
    // = int[]::new
    // int p = random(1, 6)
    public static int random(int min,int max){
        BiFunction<Integer, Integer, Integer> f = (t, u) -> (int)(Math.random()*u)+t;
        return f.apply(min, max);
    }
    // File file = new File("d:\\example\\new_directory");
    public static File makeFile(String a){
        Function<String, File> f = File::new;
        return f.apply(a);
    }
}












