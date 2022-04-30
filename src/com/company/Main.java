package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sqrt().apply(2.0));
}
    public static UnaryOperator<Double> sqrt(){
        return x->Math.sqrt(x);

}}
