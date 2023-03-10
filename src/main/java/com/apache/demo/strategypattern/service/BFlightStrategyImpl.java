package com.apache.demo.strategypattern.service;

import org.springframework.stereotype.Service;

@Service("B")
public class BFlightStrategyImpl implements FlightStrategy{
    @Override
    public String display() {
        return "B Airlines";
    }
}
