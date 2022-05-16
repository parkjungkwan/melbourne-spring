package kr.scalar.api.common.streams;

import kr.scalar.api.common.dataStructure.AppleApp;
import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: kr.scalar.api.common.streams
 * fileName   : HelloStream
 * author     : parkjungkwan
 * date       : 2022-05-16
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-16   parkjungkwan  최초 생성
 */
// 한국어 안녕, 영어 Hello
public class HelloStream {
    @Data
    public static class Hello{
    private String greeting, inLanguage;
    
    public Hello(Builder builder){
        this.greeting = builder.greeting;
        this.inLanguage = builder.inLanguage;
    }
    static public class Builder{
        private String greeting, inLanguage;
        public Builder greeting(String greeting){this.greeting=greeting; return this;}
        public Builder inLanguage(String inLanguage){this.inLanguage=inLanguage; return this;}
        public Hello build(){return new Hello (this);}
    }

        @Override
        public String toString() {
            return String.format(" 인사 : %s, %s", inLanguage,greeting);
        }
    }
    interface HelloService{
        Set<String> greet(String[] arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public Set<String> greet(String[] arr) {
            return Arrays.asList(arr)
                    .stream()
                    .filter(e -> e.startsWith("영어"))
                    .collect(Collectors.toSet());
        }
    }
    @Test
    void helloTest(){
        String[] arr = {"한국어 안녕","영어 Hello"};
        HelloService s = new HelloServiceImpl();
        Set<String> s2 = s.greet(arr);
        s2.forEach(System.out::print);
    }
}
