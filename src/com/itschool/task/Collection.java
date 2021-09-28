package com.itschool.task;

import java.util.Arrays;

public class Collection implements ICollection {
   Integer[] collection;

   public Collection() {
      this.collection = new Integer[0];
   }

   public Collection(int size) {
      this.collection = new Integer[size];
   }

   @Override
   public void add(Object item) {
      this.collection = Arrays.copyOf(this.collection, this.collection.length + 1);
      this.collection[this.collection.length - 1] = (Integer) item;
   }

   @Override
   public void add(Object item, int index) {
      if (collection.length == 0 && index == 0) {
         this.add(item);
      } else if (index >= 0 && index <= collection.length) {
         this.collection = Arrays.copyOf(this.collection, this.collection.length + 1);

         for (int i = collection.length - 1; i > index; i--) {
            this.collection[i] = this.collection[i - 1];
         }

         this.collection[index] = (Integer) item;
      }
   }

   @Override
   public Object remove(int index) {
      if (index >= 0 && index < collection.length) {
         Integer deletedItem = this.collection[index];

         for (int i = index; i < collection.length - 1; i++) {
            this.collection[i] = this.collection[i + 1];
         }
         this.collection = Arrays.copyOf(this.collection, this.collection.length - 1);
         return deletedItem;
      }
      return null;
   }

   @Override
   public void clear() {
      this.collection = new Integer[0];
   }

   @Override
   public int size() {
      return this.collection.length;
   }

   @Override
   public boolean contains(Object item) {
      for (Object itemOfCollection : this.collection) {
         if (itemOfCollection.equals(item))
            return true;
      }

      return false;
   }

   @Override
   public Object[] asArray() {
      return Arrays.copyOf(this.collection, this.collection.length);
   }

   @Override
   public Object get(int index) {
      return (index >= 0 && index < collection.length) ? this.collection[index] : null;
   }

   @Override
   public void set(Object item, int index) {
      this.add(item, index);
   }

   @Override
   public int findFirst(Object item) {
      for (int i = 0; i < this.collection.length; i++) {
         if (item.equals(this.collection[i]))
            return i;
      }

      return -1;
   }

   @Override
   public int findLast(Object item) {
      for (int i = this.collection.length - 1; i >= 0; i--) {
         if (item.equals(this.collection[i]))
            return i;
      }

      return -1;
   }

   @Override
   public String toString() {
      String result = "[ ";

      for (Object item : collection) {
         result += item + " ";
      }
      return result + "]";
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Collection that = (Collection) o;
      return Arrays.equals(this.collection, that.collection);
   }
}
