package org.KNUJavaLabs.HW.hw9;

public class Item {
    String name;
    EnumItems type;

    public Item() {
        this.name = "Empty";
        this.type = null;
    }

    Item(String name, EnumItems type) {
        this.name = name;
        this.type = type;

    }

    public Item getItem(EnumItems item, String name) {
        Item b = null;
        switch (item) {
            case PROSPECT:
                b = new Prospect(name);
                break;
            case SQUARE:
                b = new Square(name);
                break;
            case STREET:
                b = new Street(name);
                break;
        }
        return b;
    }

    @Override
    public String toString() {
        return "<<" + name + ">>: (type: " + type + ")";
    }

    public EnumItems getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
