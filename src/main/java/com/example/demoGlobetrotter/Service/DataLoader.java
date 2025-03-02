package com.example.demoGlobetrotter.Service;

import com.example.demoGlobetrotter.Entity.Destination;
import com.example.demoGlobetrotter.Repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private DestinationRepository destinationRepository;

    @Override
    public void run(String... args) throws Exception {
        // Clear existing data (optional)
        destinationRepository.deleteAll();

        // Add new destinations
        Destination destination1 = new Destination();
        destination1.setCity("Paris");
        destination1.setCountry("France");
        destination1.setClues(Arrays.asList("City of Lights", "Home to the Eiffel Tower"));
        destination1.setFun_fact(Arrays.asList(
                "The Eiffel Tower was originally intended to be a temporary installation.",
                "Paris has a secret underground city called 'Les Catacombes'."
        ));
        destination1.setTrivia(Arrays.asList(
                "What is the most visited paid monument in the world?",
                "Which river runs through Paris?"
        ));
        destinationRepository.save(destination1);

        Destination destination2 = new Destination();
        destination2.setCity("Tokyo");
        destination2.setCountry("Japan");
        destination2.setClues(Arrays.asList("Capital of Japan", "Known for its cherry blossoms"));
        destination2.setFun_fact(Arrays.asList(
                "Tokyo has the world's busiest pedestrian crossing.",
                "The city has more neon signs than any other city in the world."
        ));
        destination2.setTrivia(Arrays.asList(
                "What is the name of the famous fish market in Tokyo?",
                "Which mountain is near Tokyo?"
        ));
        destinationRepository.save(destination2);

        Destination destination3 = new Destination();
        destination3.setCity("New York");
        destination3.setCountry("USA");
        destination3.setClues(Arrays.asList("The Big Apple", "Home to the Statue of Liberty"));
        destination3.setFun_fact(Arrays.asList(
                "Central Park is larger than some countries.",
                "New York City has over 800 languages spoken."
        ));
        destination3.setTrivia(Arrays.asList(
                "What is the nickname for New York City?",
                "Which famous park is in the center of Manhattan?"
        ));
        destinationRepository.save(destination3);

        Destination destination4 = new Destination();
        destination4.setCity("London");
        destination4.setCountry("UK");
        destination4.setClues(Arrays.asList("Home to Big Ben", "Famous for double-decker buses"));
        destination4.setFun_fact(Arrays.asList(
                "London has over 170 museums.",
                "The London Underground is the oldest metro system in the world."
        ));
        destination4.setTrivia(Arrays.asList(
                "What is the famous clock tower in London called?",
                "Which river runs through London?"
        ));
        destinationRepository.save(destination4);

        Destination destination5 = new Destination();
        destination5.setCity("Tokyo");
        destination5.setCountry("Japan");
        destination5.setClues(Arrays.asList("Land of sushi", "Has the busiest pedestrian crossing"));
        destination5.setFun_fact(Arrays.asList(
                "Tokyo has more Michelin-star restaurants than any other city.",
                "Shinjuku Station is the busiest train station in the world."
        ));
        destination5.setTrivia(Arrays.asList(
                "What type of food is Tokyo famous for?",
                "What is the name of Tokyo’s busiest pedestrian crossing?"
        ));
        destinationRepository.save(destination5);

        Destination destination6 = new Destination();
        destination6.setCity("Sydney");
        destination6.setCountry("Australia");
        destination6.setClues(Arrays.asList("Famous for its Opera House", "Harbor city"));
        destination6.setFun_fact(Arrays.asList(
                "Sydney Opera House took 14 years to build.",
                "Sydney has over 100 beaches."
        ));
        destination6.setTrivia(Arrays.asList(
                "What is the name of the famous opera house in Sydney?",
                "Which landmark is known as the ‘Coathanger’ in Sydney?"
        ));
        destinationRepository.save(destination6);

        Destination destination7 = new Destination();
        destination7.setCity("Rome");
        destination7.setCountry("Italy");
        destination7.setClues(Arrays.asList("City of ancient ruins", "Home of the Colosseum"));
        destination7.setFun_fact(Arrays.asList(
                "Rome has a museum dedicated to pasta.",
                "The Vatican City is the world's smallest country."
        ));
        destination7.setTrivia(Arrays.asList(
                "Which ancient amphitheater is in Rome?",
                "What is the small independent country within Rome?"
        ));
        destinationRepository.save(destination7);

        Destination destination8 = new Destination();
        destination8.setCity("Cairo");
        destination8.setCountry("Egypt");
        destination8.setClues(Arrays.asList("Home to the Pyramids", "Located along the Nile River"));
        destination8.setFun_fact(Arrays.asList(
                "The Great Pyramid was the tallest man-made structure for 3,800 years.",
                "Cairo is the largest city in Africa."
        ));
        destination8.setTrivia(Arrays.asList(
                "What famous river flows through Cairo?",
                "Which ancient structure is located in Giza near Cairo?"
        ));
        destinationRepository.save(destination8);

        Destination destination9 = new Destination();
        destination9.setCity("Rio de Janeiro");
        destination9.setCountry("Brazil");
        destination9.setClues(Arrays.asList("Famous for Christ the Redeemer", "Known for its Carnival festival"));
        destination9.setFun_fact(Arrays.asList(
                "Rio's Carnival is the biggest carnival in the world.",
                "The city was once the capital of Portugal."
        ));
        destination9.setTrivia(Arrays.asList(
                "What is the famous statue overlooking Rio de Janeiro?",
                "What is the annual festival Rio is famous for?"
        ));
        destinationRepository.save(destination9);

        Destination destination10 = new Destination();
        destination10.setCity("Dubai");
        destination10.setCountry("UAE");
        destination10.setClues(Arrays.asList("Home to the tallest building in the world", "Known for luxury shopping"));
        destination10.setFun_fact(Arrays.asList(
                "Dubai was once a small fishing village.",
                "The city has an indoor ski resort in the desert."
        ));
        destination10.setTrivia(Arrays.asList(
                "What is the tallest building in Dubai called?",
                "What artificial islands are shaped like a palm tree in Dubai?"
        ));
        destinationRepository.save(destination10);

        Destination destination11 = new Destination();
        destination11.setCity("Istanbul");
        destination11.setCountry("Turkey");
        destination11.setClues(Arrays.asList("Spans two continents", "Famous for its Grand Bazaar"));
        destination11.setFun_fact(Arrays.asList(
                "Istanbul is the only city in the world on two continents.",
                "The Grand Bazaar has over 4,000 shops."
        ));
        destination11.setTrivia(Arrays.asList(
                "Which famous market is located in Istanbul?",
                "What two continents does Istanbul connect?"
        ));
        destinationRepository.save(destination11);

        Destination destination12 = new Destination();
        destination12.setCity("Bangkok");
        destination12.setCountry("Thailand");
        destination12.setClues(Arrays.asList("Known as the 'City of Angels'", "Famous for its street food"));
        destination12.setFun_fact(Arrays.asList(
                "Bangkok has the world's longest city name in Thai.",
                "The city has floating markets."
        ));
        destination12.setTrivia(Arrays.asList(
                "What is the nickname of Bangkok?",
                "What type of market is famous in Bangkok?"
        ));
        destinationRepository.save(destination12);

        Destination destination13 = new Destination();
        destination13.setCity("Los Angeles");
        destination13.setCountry("USA");
        destination13.setClues(Arrays.asList("Hollywood’s home", "City of Angels"));
        destination13.setFun_fact(Arrays.asList(
                "The Hollywood sign was originally an ad for real estate.",
                "LA has more museums than any other US city."
        ));
        destination13.setTrivia(Arrays.asList(
                "What is the famous film industry area in LA?",
                "What is LA's nickname?"
        ));
        destinationRepository.save(destination13);

// Add more destinations following the same pattern...




        System.out.println("Data loaded successfully!");
    }
}