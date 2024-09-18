package org.KNUJavaLabs.ClassWork.lab8;

import java.util.Arrays;
import java.util.Objects;

class Flower extends FlowerLength {
    Accessories accessories;

    Flower(int length, int degreeOfSpoil, Accessories accessories) {
        this.length = length;
        this.degreeOfSpoil = degreeOfSpoil;
        this.accessories = accessories;

    }

    @Override
    public String toString() {
        float summ = this.getValue() + this.accessories.getValue();
        return "Flower{" +
                "length='" + this.length + '\n' +
                "degreeOfSpoil=" + this.degreeOfSpoil + "\n" +
                "value of Flower =" + this.getValue() + " hrn\n" +
                "value of Accessories =" + this.accessories.getValue() + " hrn\n" +
                "Summary =" + summ + " hrn\n" +
                '}';
    }

    public float getValue() {
        return (this.length * 5) * (1.0F / this.degreeOfSpoil) + 30;
    }
}

class FlowerLength extends FlowerSpoil {
    int length;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}

class FlowerSpoil {
    int degreeOfSpoil;

    public void setDegreeOfSpoil(int degreeOfSpoil) {
        this.degreeOfSpoil = degreeOfSpoil;
    }

    public int getDegreeOfSpoil() {
        return this.degreeOfSpoil;
    }

}

class Accessories {
    String[] accessories;

    Accessories(String[] accessories) {
        this.accessories = accessories;
    }

    public void setAccessories(String[] accessories) {
        this.accessories = accessories;
    }

    public String[] getAccessories() {
        return accessories;
    }

    public float getValue() {
        float summ = 0;
        for (String accesory : accessories) {
            if (Objects.equals(accesory, "packaging")) {
                summ += 50;
            }
            if (Objects.equals(accesory, "bob")) {
                summ += 20;
            }
            if (Objects.equals(accesory, "paper")) {
                summ += 30;
            }
        }
        return summ;
    }
}

