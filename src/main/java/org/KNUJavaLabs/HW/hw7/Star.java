package org.KNUJavaLabs.HW.hw7;

/*
LabsJava4 Task 5.6
 */
public class Star {
    String name;

    Star() {
        this.name = "";
    }

    Star(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }
}
