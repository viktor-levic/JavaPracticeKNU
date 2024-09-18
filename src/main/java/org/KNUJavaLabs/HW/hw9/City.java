package org.KNUJavaLabs.HW.hw9;

import org.KNUJavaLabs.ClassWork.lab9.Client;
import org.KNUJavaLabs.ClassWork.lab9.EnumProducts;
import org.KNUJavaLabs.ClassWork.lab9.Payment;

import java.util.LinkedList;
import java.util.List;

public class City extends Item {
    String state;
    List<Item> items;

    class Information {

        LinkedList<Object[]> information;

        Information() {
            information = new LinkedList<>();
        }

        public void addInformation(Item item) {
            information.add(new Object[2]);
            information.getLast()[0] = item.getName();
            information.getLast()[1] = item.getType();

        }

        @Override
        public String toString() {
            String s = "\nType         | Name";

            for (Object[] o : information)
                s += "\n" + o[0] + " |     " + o[1];
            return s;
        }

    }

    City(List<Item> itemList) {
        this.items = itemList;
        this.information = new Information();
        for (Item item : itemList) {
            try {
                if (item.getType() == null || item.getName() == null) {
                    throw new MyException("Type or name is null");
                } else {
                    addItem(item.getType(), item.getName());
                }
            } catch (MyException e) {
                System.out.println(e);
            }
        }
    }

    Information information;

    public void addItem(EnumItems enum_, String name) {
        Item item = new Item().getItem(enum_, name);
        information.addInformation(item);

    }

    public void seeInformation() {
        System.out.println(information);
    }

}
