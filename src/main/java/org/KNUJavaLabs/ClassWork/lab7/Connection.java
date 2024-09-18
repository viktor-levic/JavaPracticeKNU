package org.KNUJavaLabs.ClassWork.lab7;

/*
LabsJava4 Task 1
 */
public class Connection {

    private boolean available;

    // package level of visibility. To prevent creation of Connection outside package
    Connection() {
        available = true;
    }


    public void connect() {
        System.out.println("emulate connection");
    }

    public boolean isAvailable() {
        return available;
    }
}
