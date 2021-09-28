package com.itschool.task;

public interface ICollection {
   void add(Object item);
   void add(Object item, int index);
   Object remove(int index);
   void clear();
   int size();
   boolean contains(Object item);
   Object[] asArray();
   Object get(int index);
   void set(Object item, int index);
   int findFirst(Object item);
   int findLast(Object item);
   @Override
   boolean equals(Object item);
   @Override
   String toString();
}
