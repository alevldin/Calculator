package com.company;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    java.util.function.BinaryOperator<Integer> plus = (x, y) -> x + y;
    java.util.function.BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;   ошибка деления by zero
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    java.util.function.Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
