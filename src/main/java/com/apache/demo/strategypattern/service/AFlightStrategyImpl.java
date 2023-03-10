package com.apache.demo.strategypattern.service;

import org.springframework.stereotype.Service;

@Service("A")
public class AFlightStrategyImpl  implements FlightStrategy{

    @Override
    public String display() {
        return "A Airlines";
    }
}
