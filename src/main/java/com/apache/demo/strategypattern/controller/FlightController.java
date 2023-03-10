package com.apache.demo.strategypattern.controller;

import com.apache.demo.strategypattern.service.AFlightStrategyImpl;
import com.apache.demo.strategypattern.service.BFlightStrategyImpl;
import com.apache.demo.strategypattern.service.FlightStrategy;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class FlightController {

    private AFlightStrategyImpl a;

    private BFlightStrategyImpl b;

    private final Map<String, FlightStrategy> flightStrategyUsingInterface; //2


    //not using strategy pattern
//    @GetMapping("/flights/{airline}")
//    public String getFlightInfo(@PathVariable("airline") String airline) {
//        if ("A".equals(airline)) { // 2
//            return this.a.display(); // 3
//        }
//
//        if ("B".equals(airline)) { // 2
//            return this.b.display(); // 3
//        }
//
//        return "N.A";
//    }

    @GetMapping("/flights/{airline}")
    public String getFlightInfo(@PathVariable("airline") String airline) {
        System.out.println(airline);
        System.out.println(this.flightStrategyUsingInterface.get(airline));
        FlightStrategy flight = this.flightStrategyUsingInterface.get(airline); // 3

        if (flight != null) {
            return flight.display(); // 4
        }

        return "N.A";
    }
}
