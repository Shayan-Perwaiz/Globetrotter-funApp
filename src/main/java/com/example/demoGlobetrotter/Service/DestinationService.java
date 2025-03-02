package com.example.demoGlobetrotter.Service;

import com.example.demoGlobetrotter.Entity.Destination;
import com.example.demoGlobetrotter.Repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public Destination getRandomDestination() {
        List<Destination> destinations = destinationRepository.findAll();
        Random random = new Random();
        return destinations.get(random.nextInt(destinations.size()));
    }

    public boolean validateGuess(int destinationId, String guess) {
        Destination destination = destinationRepository.findById(destinationId).orElse(null);
        return destination != null && destination.getCity().equalsIgnoreCase(guess);
    }
}