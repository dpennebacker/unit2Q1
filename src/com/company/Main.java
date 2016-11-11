package com.company;

public class Main {

    public static void main(String[] args) {

        Code testWord = new Code("Brother");//Create test object
        testWord.hide(1,2); //test something to hide
        System.out.println(testWord.getCode());//output the test

        testWord.recover(1,2);
        System.out.println(testWord.getCode());



    }
}
