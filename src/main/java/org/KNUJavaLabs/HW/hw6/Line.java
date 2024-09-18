package org.KNUJavaLabs.HW.hw6;

/*
LabsJava4 Task 3.10 class Line
 */
public class Line {
    int a, b, c;

    Line() {
        a = 0;
        b = 0;
        c = 0;
    }

    Line(Integer[] args) {
        a = args[0];
        b = args[1];
        c = args[2];
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getPointIntersectionWithX() {
        return String.format("Intersection with X {x:%.2f ; y:0}", (double) -this.c / (double) this.a);
    }

    public String getPointIntersectionWithY() {
        return String.format("Intersection with Y {x:0 ; y:%.2f}", (double) -this.c / (double) this.b);
    }

    public boolean isParallel(Line line) {
        double coeffOne = (double) this.a / (double) line.a;
        double coeffTwo = (double) this.b / (double) line.b;
        double coeffThree = (double) this.c / (double) line.c;
        return coeffOne == coeffTwo && coeffOne != coeffThree;
    }

    public boolean isEquals(Line line) {
        double coeffOne = (double) this.a / (double) line.a;
        double coeffTwo = (double) this.b / (double) line.b;
        double coeffThree = (double) this.c / (double) line.c;
        return coeffOne == coeffTwo && coeffOne == coeffThree;
    }

    public String getPointIntersectionLines(Line line) {
        String result = null;
        if (line != null) {
            if (isEquals(line)) {
                result = "Line are equal";
            } else if (isParallel(line)) {
                result = "Lines are parallel";
            } else {
                double y = (double) (line.a * this.c - this.a * line.c) / (double) (this.a * line.b - line.a * this.b);
                double x = (this.b * y + this.c) / (double) -this.a;
                result = String.format("Lines have intersection in Point : {x: %.2f ; y :%.2f};", x, y);
            }
        }
        return result;
    }

    @Override
    public String toString() {
//        return "Line{" +
//                "a=" + a +
//                ", b=" + b +
//                ", c=" + c +
//                '}';
        String result = getBlock(this.a, "x", true);
        result = result.concat(getBlock(this.b, "y", this.a == 0));
        result = result.concat(getBlock(this.c, "", this.a == 0 && this.b == 0));
        return result.concat(" = 0");
    }

    private String getBlock(int number, String prefix, boolean first) {
        String result = "";
        if (number != 0) {
            if (first) {
                result = String.format("%d%s", number, prefix);
            } else {
                String sign = number < 0 ? "-" : "+";
                result = String.format(" %s %d%s", sign, Math.abs(number), prefix);
            }
        }
        return result;
    }
}
