package org.KNUJavaLabs.HW.hw7;
/*
LabsJava4 Task 5.6
 */

import java.util.ArrayList;
import java.util.List;

public class Task5_6 {
    public static void main(String[] args) {
        int n = 4;//Count of planets
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Earth"));
        planets.add(new Planet("Mars"));
        planets.add(new Planet("Jupiter"));
        planets.add(new Planet("Saturn"));

        Star star = new Star("Betelgeuse");

        Moon moon = new Moon();
        StarSystem starSystem = new StarSystem(planets, moon, star);
        starSystem.addPlanet(new Planet("Bogdan"));
        int countOfPlanets = starSystem.getPlanets().size();

        System.out.println("We have " + countOfPlanets + " planets in our StarSystem");
        System.out.println("Name of our Star is : " + starSystem.getStar().getName());
    }
}
