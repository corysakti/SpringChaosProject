package com.apache.demo.randomdesignpattern.abstractfactory;

public class DeveloperManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
