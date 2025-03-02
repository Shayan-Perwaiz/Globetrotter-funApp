package com.example.demoGlobetrotter.Repository;

import com.example.demoGlobetrotter.Entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}