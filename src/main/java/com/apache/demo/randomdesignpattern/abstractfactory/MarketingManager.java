package com.apache.demo.randomdesignpattern.abstractfactory;

public class MarketingManager extends HiringManager{
    @Override
    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
