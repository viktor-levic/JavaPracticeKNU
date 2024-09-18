package org.KNUJavaLabs.HW.hw6;
/*
LabsJava4 Task 2.4 class Abiturient
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Abiturient {

    int[] marks;
    int id;
    String name, lastname, fathername, address;
    int phoneNumber;

    Abiturient() {
        id = 0;
        name = "Undefined";
        lastname = "Undefined";
        fathername = "Undefined";
        address = "N.";
        phoneNumber = 0;
        marks = new int[0];
    }

    Abiturient(String[] arr, int[] marksList) {
        id = Integer.parseInt(arr[0]);
        name = arr[1];
        lastname = arr[2];
        fathername = arr[3];
        address = arr[4];
        phoneNumber = Integer.parseInt(arr[5]);
        marks = marksList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFathername(String fathername) {
        this.lastname = fathername;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public String toString() {
        String data = "\nStudent:";
        data += "Id " + id;
        data += "\n" + name + " " + lastname + " " + fathername;
        data += "\naddress: " + address;
        data += "\nphone number: " + Integer.toString(phoneNumber);
        data += "\nmarks: " + Arrays.toString(marks);
        return data;
    }
}
