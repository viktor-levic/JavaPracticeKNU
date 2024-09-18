package org.KNUJavaLabs.ClassWork.lab7;
/*
LabsJava4 Task 4.1
 */

import java.awt.*;
import java.util.Arrays;

public class Polinom {
    float[] coefs;

    Polinom(float[] coefs) {
        this.coefs = coefs;
    }

    public float[] getCoefs() {
        return coefs;
    }

    public float[] setCoefs(float[] coefs) {
        this.coefs = coefs;
        return this.coefs;
    }


    @Override
    public String toString() {
        return "Polinom{" +
                "coefs=" + Arrays.toString(coefs) +
                '}';
    }
}
