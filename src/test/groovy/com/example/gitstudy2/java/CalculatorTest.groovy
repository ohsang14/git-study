package com.example.gitstudy2.java

import spock.lang.Specification

class CalculatorTest extends Specification {
    def "sum"() {
        given:
        def calculator = new Calculator();

        when:
        def actual = calculator.sum(a, b) // 타입 선언 제거

        then:
        actual == expected

        where:
        a   | b    | expected
        10  | 20   | 30
        100 | 1000 | 1100
    }
    def "exception"(){
        given:
        def a = -1
        def b = 10
        def calculator = new Calculator()

        when:
        def actual = calculator.sum(a,b)

        then:
        thrown(RuntimeException.class)
    }
}

