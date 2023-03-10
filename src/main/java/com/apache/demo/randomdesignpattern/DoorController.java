package com.apache.demo.randomdesignpattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorController {

    @GetMapping("/door")
    public String getFlightInfo() {
        // Make me a door of 100x200
        Door door = DoorFactory.makeDoor(100, 200);

        System.out.println("Width: " + door.getWidth());
        System.out.println("Height: " + door.getHeight());

        // Make me a door of 50x100
        Door door2 = DoorFactory.makeDoor(50, 100);

        return "Door : "+door.getWidth() +", Door 2 : "+door2.getWidth();
    }
}
