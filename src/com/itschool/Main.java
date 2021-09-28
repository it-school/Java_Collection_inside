package com.itschool;
import com.itschool.task.Collection;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.add(1);
        collection.add(2);
        collection.add(4);
        collection.add(5);
        System.out.println(collection);

        collection.add(3, 2);
        System.out.println(collection);

        System.out.println(collection.remove(3));
        System.out.println(collection);

        System.out.println(collection.contains(5));
        System.out.println(collection.contains(15));

        Collection collection1 = new Collection();
        collection1.set(1,0);
        collection1.set(2,1);
        collection1.set(3,2);
        collection1.set(5,3);

        System.out.println(collection);
        System.out.println(collection1);

        System.out.println(collection.equals(collection1));

        collection.add(3);
        collection.add(5);
        collection.add(3);
        collection.add(7);
        System.out.println(collection);
        System.out.println(collection.findFirst(3));
        System.out.println(collection.findLast(3));
        System.out.println(collection.findLast(0));
        System.out.println(collection.findFirst(6));
    }
}
