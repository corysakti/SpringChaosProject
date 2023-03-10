package com.apache.demo.randomdesignpattern.abstractfactory;

public class Manager implements Interviewer{
    @Override
    public void askQuestions() {
        System.out.println("Asking about community building!");
    }
}
