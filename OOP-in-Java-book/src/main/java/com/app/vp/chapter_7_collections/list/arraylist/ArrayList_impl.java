package com.app.vp.chapter_7_collections.list.arraylist;

/**
 * -implementing all operations assigned for data structure array;
 * -enable all type of elements including null;
 * -has methods that can adjust a volume of the array by initiating capacity;
 * -not synchronized;
 * -volume of the ArrayList object always not less than capacity;
 * -since adding elements volume arising automatically;
 * -consistency is not guaranteed for multithreading;
 * -maintain the order of elements in the order they were inserted;
 * */
public class ArrayList_impl {
    public static void main(String[] args) {

        /*ArrayList:

        * Constructors:
        * -ArrayList(): created with basic volume = 10;
        * -ArrayList(Collection<? extends E> c): created with elements by defining type and return as them were added by iterator;
        * -ArrayList(int initialCapacity) created empty array with initiated value of capacity;

        * Methods:

                    * Adding Elements:
            -boolean add(E element): Adds an element to the end of the list;
            -boolean addAll(Collection<? extends E> c): Adds all elements from another collection to the end of the list;
            -void add(int index, E element): Inserts an element at a specific index in the list;
            -boolean addAll(int index, Collection<? extends E> c): Adds all elements from another collection to index position;

                    * Removing Elements:
            -boolean remove(Object o): Removes the first occurrence of a specific element from the list;
            -E remove(int index): Removes the element at a specific index from the list;
            -boolean removeAll(Collection<?> c): Removes all elements from the list that are also present in another collection;
            -protected void removeRange(int fromIndex, int toIndex) removes from the list all elements whose index is
             from fromIndex (inclusive), to toIndex (not including it);
            -boolean retainAll(Collection<?> c) retains in the given list only those elements contained in the specified collection;

                  * Accessing Elements:
            -E get(int index): Returns the element at a specific index in the list.
            -int indexOf(Object o): Returns the index of the first occurrence of a specific element in the list.
            -int lastIndexOf(Object o): Returns the index of the last occurrence of a specific element in the list.

                  * Other Useful Methods:
            -int size(): Returns the number of elements in the list.
            -boolean isEmpty(): Checks if the list is empty.
            -boolean contains(Object o): Checks if the list contains a specific element.
            -void clear(): Removes all elements from the list.
            -E set(int index, E element): Replaces the element at a specific index with a new element.
            -Object clone() return copy of the obj with same fields values of current element
            -void ensureCapacity(int minCapacity) increases list if necessary, to ensure that it can contain at
             least the number of elements specified in the minCapacity;
            -Iterator<E> iterator() returns an iterator for the correct going through the list;
            -ListIterator<E> listIterator() returns a list iterator (for passages in the correct sequence);
            -ListIterator<E> listIterator(int index) returns an iterator list (to go through in the correct sequence),
             starting from the specified position in the list;
            -List<E> subList(int fromIndex, int toIndex) – returns a sublist representation of the given list, starting with
             the element with index fromIndex, inclusive, up to and including the element with index toIndex, not including it;
            -Object[] toArray() – returns an array of all elements of the given list in the correct order
            -<T> T[] toArray(T[] a) – returns an array containing all elements in the correct sequence;
             return array type when executed, it is the same as that of the specified array;
            -void trimToSize() – trims the array to the size of the given ArrayList instance, which will be the current size
             of the list (so just like removing elements does not change the size of the list);

                * Methods inherited from AbstractList:
            -boolean equals(Object o) – compares the specified object with the given list (for equality);
            -int hashCode(); return hashCode of the current ArrayList object

                * Methods inherited from AbstractCollection:
             -containsAll – returns true if the given list contains everything elements of the specified collection;
             -toString – returns a string representation of the collection characters.

                *Methods inherited from Object.class:
             -protected void finalize() – throws a Throwable exception, this The method is called when the Java garbage collector
              detects that there are no references to the object;
             -public final Class<?> getClass() – returns the class of an object at runtime;
             -public final void notify() – one thread “wakes up”, which waits on the “monitor” for this object;
             if multiple threads are waiting given object, then one of them is selected for “waking up”;
             -public final void notifyAll() – wakes up all threads;
             -public final void wait(long timeout) – throws an exception InterruptedException.
             The wait() method has three variations.
             One wait() method waits indefinitely for another thread until called notify() or notifyAll() method on an object.
             The other two variations of the wait() method cause the current thread to wait for a certain amount of time.
             After this time, the thread wakes up and continues working;

                *Methods inherited from а java.util.List:
             -boolean containsAll(Collection<?> c) – true, if current array contains all elements of that collection;
             -boolean equals(Object o) – compare Object to the array based on equals;
             true if and only if when the specified object is also a list, both lists have the same size and all corresponding
             pairs of elements in both lists are equal
             Two elements e1 and e2 are considered equal if e1==null ? e2==null : e1.equals(e2);
             -int hashCode() – returns the hash code value for the given list, the hash code for the list is determined as
             the result of the following calculations:
                 int hashCode = 1;
                 for(E e : list){
                    hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
                 };
             */

    }
}
