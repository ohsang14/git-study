package com.example.gitstudy2.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @ParameterizedTest
    @MethodSource("numberProvider")
    @DisplayName("더하기 테스트")
    void sum(int a, int b, int expected) {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.sum(a, b);
        // then
        assertEquals(expected, actual);
    }
    static Stream<Arguments> numberProvider(){
        return Stream.of(
                Arguments.arguments(10,5,15),
                Arguments.arguments(0,0,0)
        );
    }
    @ParameterizedTest
    @MethodSource("numberProviderForException")
    @DisplayName("음수의 값은 예외가 발생하여야 한다")
    void sumExceptionTest(int a, int b){
        // given
        Calculator calculator = new Calculator();

        // when & then
        assertThrows(
                RuntimeException.class,
                ()-> calculator.sum(a,b)
        );
    }
    static Stream<Arguments> numberProviderForException(){
        return Stream.of(
                Arguments.arguments(-10,5),
                Arguments.arguments(1,-100)
        );
    }
}