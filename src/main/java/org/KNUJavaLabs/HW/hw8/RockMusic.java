package org.KNUJavaLabs.HW.hw8;

public class RockMusic extends RockMusicTime {
    String name;

    RockMusic(String name, float time, String style) {
        this.name = name;
        this.time = time;
        this.style = style;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RockMusic{" +
                "name='" + name + '\n' +
                "length=" + this.time + "\n" +
                "style=" + this.style + "\n" +
                '}';
    }
}

class RockMusicTime extends RockMusicType {
    Float time;

    public void setTime(Float time) {
        this.time = time;
    }

    public Float getTime() {
        return this.time;
    }
}

class RockMusicType {

    String style;

    public void setType(String style) {
        this.style = style;
    }

    public String getType() {
        return this.style;
    }

}


