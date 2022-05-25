package kr.scalar.api.common._bruteForce;

import kr.scalar.api.common._greedy.최대최소값;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * packageName: kr.scalar.api.common._bruteForce
 * fileName   : 계산기1
 * author     : parkjungkwan
 * date       : 2022-05-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-25   parkjungkwan  최초 생성
 */
public class 계산기 {
    @Data
    @AllArgsConstructor
    static class Calculator{

        private int num1;
        private String opcode;
        private int num2;
        @Override public String toString(){

            int res = 0;
            switch (opcode){
                case "+": res = num1 + num2; break;
                case "-": res = num1 - num2; break;
                case "*": res = num1 * num2; break;
                case "/": res = num1 / num2; break;
            }
            return num1 + " "+opcode+" "+num2 +" = "+res;
        }
    }
    @FunctionalInterface interface SolutionService {
        최대최소값.Solution solution(최대최소값.Solution s);
    }
    @Test
    void testSolution(){
        int[] arr = {3, 1, 9, 5, 10};
        최대최소값.SolutionService f = e ->{
            int min = 10;
            for(int i : e.getArr()){
                if(i < min) min = i;
            }
            return 최대최소값.Solution.builder().min(min).build();
        };
        최대최소값.Solution s = 최대최소값.Solution.builder().arr(arr).build();
        System.out.println(new Calculator(2, "+", 7));;
    }
}
