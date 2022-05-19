package kr.scalar.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: kr.scalar.api.common.algorithm
 * fileName   : Gugudan
 * author     : parkjungkwan
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   parkjungkwan  최초 생성
 */
public class Gugudan {
    @Builder @Getter @NoArgsConstructor @AllArgsConstructor
    public static class Solution{
        private int[][] arr ;
        @Override
        public String toString() {
            return String.format("") ;
        }
    }
    @FunctionalInterface interface ISolution{
        void solution();
    }
    @Test
    void test(){
        ISolution a = ()-> {
            int i = 0, j = 0;

            for ( i = 1; i < 10; i++) {
                for ( j = 2; j < 6; j++) {
                    System. out.print( j + "*" + i + "=" + i * j + "\t");
                }
                System. out.println();
            }
            System. out.println();
            for ( i = 1; i < 10; i++) {
                for ( j = 6; j < 10; j++) {
                    System. out.print( j + "*" + i + "=" + i * j + "\t");
                }
                System. out.println();
            }
        };
        a.solution();
    }




}
