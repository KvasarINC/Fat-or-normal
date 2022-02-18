package com.learning;

import java.util.Scanner;

public class Body {

    String name;
    int old;
    float hight;
    float width;

    String true_sports;
    String false_sports;

    public void ResultSports() {
        true_sports = "Your Normal";
        false_sports = "Ohh.. no.. You fat!";
        float result = hight - 110;
        float result_two = result * 1.15f;
        if (width <= result_two) {
            System.out.println("My name is: " + name);
            System.out.println("Old: " + old);
            System.out.println("My hight: " + hight);
            System.out.println("My width: " + width);
            System.out.println(true_sports);
        } else {
            System.out.println("My name is: " + name);
            System.out.println("Old: " + old);
            System.out.println("My hight: " + hight);
            System.out.println("My width: " + width);
            System.out.println(false_sports);
        }
    }
}

