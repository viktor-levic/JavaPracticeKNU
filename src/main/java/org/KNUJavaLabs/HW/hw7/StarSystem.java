package org.KNUJavaLabs.HW.hw7;
/*
LabsJava4 Task 5.6
 */

import java.util.Arrays;
import java.util.List;

public class StarSystem {
    List<Planet> planets;
    Moon moon;
    Star stars;

    StarSystem(List<Planet> planets, Moon moon, Star stars) {
        this.planets = planets;
        this.stars = stars;
        this.moon = moon;
    }

    public Star getStar() {
        return stars;
    }

    public Moon getMoon() {
        return moon;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public void setStar(Star stars) {
        this.stars = stars;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "planets=" + planets +
                ", moon=" + moon +
                ", stars=" + stars +
                '}';
    }
}
