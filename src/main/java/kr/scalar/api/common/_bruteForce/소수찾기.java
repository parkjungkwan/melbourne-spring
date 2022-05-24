package kr.scalar.api.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName: kr.scalar.api.common.algorithm
 * fileName   : PrimeNumber
 * author     : parkjungkwan
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   parkjungkwan  최초 생성
 */
public class 소수찾기 {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    static class Solution{
        int start, end;
        List<Integer> primes;

    }
    @FunctionalInterface static interface SolutionService{ Solution solution(Solution solution);}

    @Test
    void solution(){

    }
}
