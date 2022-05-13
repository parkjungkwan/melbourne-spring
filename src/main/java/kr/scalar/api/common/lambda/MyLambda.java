package kr.scalar.api.common.lambda;

/**
 * packageName: kr.scalar.api.common.lambda
 * fileName   : MyLambda
 * author     : parkjungkwan
 * date       : 2022-05-13
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-13   parkjungkwan  최초 생성
 */
public class MyLambda {
    @FunctionalInterface interface MyFunction{int execute(String arg);}
    @FunctionalInterface interface MySupplier{int execute();}
    @FunctionalInterface interface MyConsumer{void execute(String arg);}
    @FunctionalInterface interface MyPredicate{boolean execute(String arg);}
    @FunctionalInterface interface MyInterface{String myMethod();}
    @FunctionalInterface interface MyUnaryOp{int operator(Integer a);}
    @FunctionalInterface interface MathOperation{int execute(int a, int b);}
}



