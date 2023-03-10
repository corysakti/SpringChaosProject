package com.apache.demo.randomdesignpattern.abstractfactory;

public abstract class HiringManager {

    // Factory method
    protected abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}
