package com.example.demoGlobetrotter.Controller;

import com.example.demoGlobetrotter.Entity.Destination;
import com.example.demoGlobetrotter.Service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/destination")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/random")
    public Destination getRandomDestination() {
        return destinationService.getRandomDestination();
    }

    @PostMapping("/guess")
    public String validateGuess(@RequestParam int destinationId, @RequestParam String guess) {
        return destinationService.validateGuess(destinationId, guess) ? "Correct! 🎉" : "Incorrect! 😢";
    }
}
