package org.KNUJavaLabs.ClassWork.lab2;

/*
LabsJava1_2 (1 Part) Task 3.4
 */

import java.math.BigDecimal;

public class Task3_4 {
    float num1f = 1e-4f;
    double num1d = 1e-4;
    BigDecimal num1ld = new BigDecimal("1e-4");

    float num2f = 2.33e5f;
    double num2d = 2.33e5;
    BigDecimal num2ld = new BigDecimal("2.33e5");

    float num3f = (float) Math.PI;
    double num3d = Math.PI;
    BigDecimal num3ld = new BigDecimal(Math.PI);

    float num4f = (float) Math.E;
    double num4d = Math.E;
    BigDecimal num4ld = new BigDecimal(Math.E);

    float num5f = (float) Math.sqrt(5);
    double num5d = Math.sqrt(5);
    BigDecimal num5ld = BigDecimal.valueOf(Math.sqrt(5));

    float num6f = (float) Math.log(100);
    double num6d = Math.log(100);
    BigDecimal num6ld = BigDecimal.valueOf(Math.log(100));

}
