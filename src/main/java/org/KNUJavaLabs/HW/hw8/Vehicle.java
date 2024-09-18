package org.KNUJavaLabs.HW.hw8;

/*
LabsJava4 Task 7.13
 */
interface Vehicle {
    void ride();
}

abstract class HromadskyVehicle implements Vehicle {
    String mark;
    String number;

    HromadskyVehicle(String number, String mark) {
        this.mark = mark;
        this.number = number;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMark() {
        return this.mark;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public void ride() {
        System.out.println("HromadskyTransport " + this.mark + " with number " + this.number + " IS RIDING");
        route();
    }

    public abstract void route();

    @Override
    public String toString() {
        return "HromadskyVehicle{" +
                "mark='" + this.mark + '\'' +
                ", number='" + this.number + '\'' +
                '}';
    }
}

class Tram extends HromadskyVehicle {
    int start;
    int end;

    Tram(String mark, String number, int start, int end) {
        super(number, mark);
        this.start = start;
        this.end = end;
    }

    public void route() {
        System.out.println("From" + this.start + " To " + this.end + " For " + (this.end - this.start) + " Miles");
    }
}
